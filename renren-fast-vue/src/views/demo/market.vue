<template>
  <div class="mod-demo-echarts">
    <filter-bar></filter-bar>
  </div>
</template>

<script>
  import axios from 'axios'
  import Vue from 'vue'
  import VueEvents from 'vue-events'
  import FilterBar from './FilterBar'

  Vue.use(VueEvents)
  Vue.component('filter-bar', FilterBar)

  export default {
    data () {
      return {
        fields: [
          {name: 'name'},
          {name: 'value'}
        ]
      }
    },
    mounted () {
      this.$events.$on('filter-set', eventData => this.onFilterSet(eventData))
      this.$events.$on('filter-reset', e => this.onFilterReset())
    },
    methods: {
      onFilterSet (filterText) {
        console.log('filter-set', filterText)
        axios({
          method: 'get',
          url: '/marketApi' + '?secuID=' + filterText
        }).then(function (res) {
          console.log(res.data)
        }).catch(res => {
          console.log('Failed: ' + res.status + ',' + res.statusText)
        })
      },
      onFilterReset () {
        console.log('filter-reset')
      }
    }
  }
</script>

<style lang="scss">
  .mod-demo-echarts {
    > .el-alert {
      margin-bottom: 10px;
    }
    > .el-row {
      margin-top: -10px;
      margin-bottom: -10px;
      .el-col {
        padding-top: 10px;
        padding-bottom: 10px;
      }
    }
    .chart-box {
      min-height: 400px;
    }
  }
</style>
