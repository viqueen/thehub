import Vue from 'vue'
import Dashboard from '@/components/Dashboard'

describe('Dashboard.vue', () => {
  it('should render the sidebar', () => {
    const Constructor = Vue.extend(Dashboard)
    const vm = new Constructor().$mount()
    expect(vm.$el.querySelector('.md-transparent h2').textContent)
      .to.equal('API Browser')
  })
})
