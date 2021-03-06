package com.diboot.shiro.service;

import com.diboot.shiro.config.AuthType;
import com.diboot.shiro.entity.SysUser;
import com.diboot.shiro.jwt.BaseJwtAuthenticationToken;

/***
 * 认证方式接口
 * @author Yangzhao
 * @version v2.0
 * @date 2019/6/6
 */
public interface AuthWayService {

    /***
     * 获取认证类型
     * @return
     */
    AuthType authType();

    /***
     * 根据令牌初始化认证方式
     * @param token
     */
    void initByToken(BaseJwtAuthenticationToken token);

    /***
     * 根据具体用户类型，获取账户信息
     * @return
     */
    SysUser getUser();

    /***
     * 是否需要密码
     * @return
     */
    boolean requirePassword();

    /***
     * 密码是否匹配
     * @return
     */
    boolean isPasswordMatch();

    /***
     * 是否已初步验证（如果没有初步验证，则在验证过程中会再次验证）
     * @return
     */
    boolean isPreliminaryVerified();

    /***
     * 获取该认证方式过期时间(分钟)
     * @return
     */
    Long getExpiresInMinutes();
}
