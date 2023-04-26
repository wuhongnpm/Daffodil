import { createRouter,createWebHashHistory } from 'vue-router'

//通过createRouter 创建路由实例
const router = createRouter({
    history: createWebHashHistory(),
    // 有两种形式: createWebHistory 和 createWebHashHistory
    //路径 ->组件,对应配置
    routes: [
        {
            path: '/',
            redirect: '/'
        },
        {
            path: '/about',
            name:'about',
            component: ()=> import('@/views/About.vue')
        },
        {
            path: '/cc',
            name:'cc',
            component: ()=> import('@/views/Ac.vue')
        }
        
    ]
})
export default router //将路由实例抛出