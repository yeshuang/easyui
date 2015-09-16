/**
 * COPYRIGHT (C) 2010 LY. ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system,
 * or transmitted, on any form or by any means, electronic, mechanical, photocopying,
 * recording, or otherwise, without the prior written permission of 3KW.
 *
 * Created By: Shuang
 * Created On: 2015年9月7日
 *
 * Amendment History:
 * 
 * Amended By       Amended On      Amendment Description
 * ------------     -----------     ---------------------------------------------
 *
 **/
package com.summer.sys.dao;

import java.util.List;

import com.summer.sys.model.Resource;

/**
 * @ClassName: ResourceDao
 * @Description: 资源数据访问接口
 * @author Shuang
 * @date 2015年9月7日 上午12:27:39
 */
public interface ResourceDao {

	public List<Resource> getAllResources();

}
