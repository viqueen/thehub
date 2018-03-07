<template>
  <md-app md-waterfall md-mode="fixed">
    <md-app-toolbar class="md-primary">
      <span class="md-title"></span>
    </md-app-toolbar>
    <md-app-drawer md-permanent="full">
      <md-toolbar class="md-transparent" md-elevation="0">
        <h2>API Browser</h2>
      </md-toolbar>

      <md-list>
        <md-list-item md-expand :key="definition.name" v-for="definition of definitions">
          <md-icon>move_to_inbox</md-icon>
          <span class="md-list-item-text">{{ definition.name }}</span>
          <md-list slot="md-expand">
            <md-list-item class="md-inset" :key="endpoint.key" v-for="endpoint of definition.endpoints">
              <span class="md-list-item-text">{{endpoint.paths[0]}}</span>
            </md-list-item>
          </md-list>
        </md-list-item>
      </md-list>
    </md-app-drawer>
  </md-app>
</template>

<script>
import Axios from 'axios'
export default {
  name: 'Dashboard',
  data () {
    return {
      definitions: []
    }
  },
  mounted () {
    Axios.get('/api/definitions')
      .then(response => { this.definitions = response.data })
  }
}
</script>

<style lang="scss" scoped>
  .md-app {
    border: 1px solid rgba(#000, .12);
  }
  .md-drawer {
    width: 400px;
    max-width: calc(100vw - 125px);
    border-right: 1px solid rgba(#000, .12);
  }
  .md-list-item-text {
    word-wrap: break-word;
  }
</style>
