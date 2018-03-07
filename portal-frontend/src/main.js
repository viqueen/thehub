// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import VueI18n from 'vue-i18n'

Vue.config.productionTip = false

const messages = {
  'en-US': {
    dashboard: {
      title: 'API Browser'
    }
  },
  nb: {
    dashboard: {
      title: 'API-nettleser'
    }
  }
}

// Create VueI18n instance with options
const i18n = new VueI18n({
  locale: navigator.languages[0],
  messages // set locale messages
})

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  i18n,
  components: { App },
  template: '<App/>'
})
