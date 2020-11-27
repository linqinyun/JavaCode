${site}-${url}
<#-- object -->
sn:${computer.sn}
date:${computer.dop?string("yyyy-MM-dd")}
cpu:${computer.info['cpu']!"无相关信息"}
status:
<#if computer.state==1>
ok
<#elseif computer.state==2>
off
<#elseif computer.state==3>
</#if>
<#-- sort_by -->
