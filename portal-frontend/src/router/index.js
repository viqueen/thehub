import Vue from 'vue'
import Router from 'vue-router'
import Dashboard from '@/components/Dashboard'
import VueMaterial from 'vue-material'
import 'vue-material/dist/vue-material.min.css'
// import 'vue-material/dist/theme/default-dark.css'
import 'vue-material/dist/theme/black-green-dark.css'
import VueI18n from 'vue-i18n'

Vue.use(VueI18n)
Vue.use(VueMaterial)
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Dashboard',
      component: Dashboard
    }
  ]
})
