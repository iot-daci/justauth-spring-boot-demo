package code.auth.demo.extend;

import me.zhyd.oauth.config.AuthSource;

/**
 * <p>
 * 扩展的自定义 source
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/10/9 14:14
 */
public enum ExtendSource implements AuthSource {
    /**
     * 统一登录，域名自行修改
     */
    UNIAUTH {
        /**
         * 授权的api
         *
         * @return url
         */
        @Override
        public String authorize() {
            return "http://localhost/sign/authz/oauth/v20/authorize";
        }

        /**
         * 获取accessToken的api
         *
         * @return url
         */
        @Override
        public String accessToken() {
            return "http://localhost/sign/authz/oauth/v20/token";
        }

        /**
         * 获取用户信息的api
         *
         * @return url
         */
        @Override
        public String userInfo() {
            return "http://localhost/sign/api/oauth/v20/me";
        }

        /**
         * 取消授权的api
         *
         * @return url
         */
        @Override
        public String revoke() {
            return null;
        }

        /**
         * 刷新授权的api
         *
         * @return url
         */
        @Override
        public String refresh() {
            return null;
        }
    },

}
