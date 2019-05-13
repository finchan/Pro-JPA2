<map version="1.0.1">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node COLOR="#0033ff" CREATED="1557725496530" ID="ID_1190665407" MODIFIED="1557728818036" TEXT="JPA 2">
<edge COLOR="#0033ff" STYLE="sharp_linear" WIDTH="4"/>
<node COLOR="#00b439" CREATED="1557725744994" ID="ID_699349431" MODIFIED="1557728776854" POSITION="right" TEXT="ORMapping">
<edge COLOR="#00b439" WIDTH="2"/>
<node COLOR="#990000" CREATED="1557725796883" ID="ID_321159392" MODIFIED="1557728776854" TEXT="Relationship">
<edge COLOR="#990000" WIDTH="1"/>
<node COLOR="#111111" CREATED="1557725909045" ID="ID_1849457850" MODIFIED="1557728800031" TEXT="Many To One">
<edge COLOR="#111111" WIDTH="thin"/>
<node COLOR="#111111" CREATED="1557725956139" FOLDED="true" ID="ID_1707433128" MODIFIED="1557728833525" TEXT="DB">
<edge COLOR="#111111" WIDTH="thin"/>
<node COLOR="#111111" CREATED="1557725959443" ID="ID_1973382921" MODIFIED="1557728800031">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#cc7832">CREATE TABLE </font>DEPARTMENT (<font color="#d0d0ff">ID </font><font color="#cc7832">INTEGER&#160;&#160;NOT NULL </font>AUTO_INCREMENT<font color="#cc7832">,<br />&#160; &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160; </font><font color="#d0d0ff">NAME </font><font color="#cc7832">VARCHAR</font>(<font color="#6897bb">255</font>)<font color="#cc7832">, PRIMARY KEY </font>(<font color="#d0d0ff">ID</font>))<font color="#cc7832">;<br />CREATE TABLE </font>EMPLOYEE (<font color="#d0d0ff">ID </font><font color="#cc7832">INTEGER&#160;&#160;NOT NULL </font>AUTO_INCREMENT<font color="#cc7832">,<br />&#160; &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160; </font><font color="#d0d0ff">NAME </font><font color="#cc7832">VARCHAR</font>(<font color="#6897bb">255</font>)<font color="#cc7832">, </font><font color="#d0d0ff">SALARY </font>BIGINT<font color="#cc7832">,<br />&#160; &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160; </font><font color="#d0d0ff">DEPARTMENT_ID </font><font color="#cc7832">INTEGER, PRIMARY KEY </font>(<font color="#d0d0ff">ID</font>)<font color="#cc7832">,<br />&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160; &#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;CONSTRAINT </font>DEPT_FK <font color="#cc7832">FOREIGN KEY </font>(<font color="#d0d0ff">DEPARTMENT_ID</font>) <font color="#cc7832">REFERENCES </font>DEPARTMENT (<font color="#d0d0ff">ID</font>))<font color="#cc7832">;</font>
    </p>
  </body>
</html>
</richcontent>
<edge COLOR="#111111" WIDTH="thin"/>
</node>
</node>
<node COLOR="#111111" CREATED="1557726060551" FOLDED="true" ID="ID_1624359940" MODIFIED="1557728832509" TEXT="Entity">
<edge COLOR="#111111" WIDTH="thin"/>
<node COLOR="#111111" CREATED="1557726613248" ID="ID_1171472220" MODIFIED="1557728800031">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#bbb529">@Entity<br />@Table</font>(name=<font color="#6a8759">&quot;manytoonedepartment&quot;</font>)<br /><font color="#cc7832">public class </font>Many2OneDepartment {<br />&#160;&#160;&#160;&#160;@Id<br />&#160;&#160;&#160; @GeneratedValue(strategy = GenerationType.IDENTITY)<br />&#160;&#160;&#160; <font color="#cc7832">private int </font>id<font color="#cc7832">;<br />&#160;&#160;&#160;&#160;private </font>String name<font color="#cc7832">;</font>
    </p>
  </body>
</html>
</richcontent>
<edge COLOR="#111111" WIDTH="thin"/>
</node>
<node COLOR="#111111" CREATED="1557726649621" ID="ID_1141900103" MODIFIED="1557728800031">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <span style="color: #bbb529"><font color="#bbb529">@Entity<br /></font></span><font color="#bbb529"><span style="color: #bbb529">@Table</span></font>(<span style="color: #d0d0ff"><font color="#d0d0ff">name </font></span>= <span style="color: #6a8759"><font color="#6a8759">&quot;manytooneemployee&quot;</font></span>)<br /><span style="color: #cc7832"><font color="#cc7832">public class </font></span>Many2OneEmployee {<br />&#160;&#160;&#160; <span style="color: #bbb529"><font color="#bbb529">@Id<br /></font></span><font color="#bbb529"><span style="color: #bbb529">&#160;&#160;&#160;&#160;@GeneratedValue</span></font>(<span style="color: #d0d0ff"><font color="#d0d0ff">strategy </font></span>= GenerationType.<span style="color: #9876aa"><font color="#9876aa">IDENTITY</font></span>)<br />&#160;&#160;&#160; <span style="color: #cc7832"><font color="#cc7832">private int </font></span><span style="color: #9876aa"><font color="#9876aa">id</font></span><span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160;&#160;private </span></font>String <span style="color: #9876aa"><font color="#9876aa">name</font></span><span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160;&#160;private long </span></font><span style="color: #9876aa"><font color="#9876aa">salary</font></span><span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160; </span></font><span style="color: #bbb529"><font color="#bbb529">@ManyToOne<br /></font></span><font color="#bbb529"><span style="color: #bbb529">&#160;&#160;&#160;&#160;@JoinColumn</span></font>(<span style="color: #d0d0ff"><font color="#d0d0ff">name</font></span>=<span style="color: #6a8759"><font color="#6a8759">&quot;department_id&quot;</font></span>)<br />&#160; &#160;&#160; <span style="color: #cc7832"><font color="#cc7832">private </font></span>Many2OneDepartment <span style="color: #9876aa"><font color="#9876aa">many2OneDepartment</font></span><span style="color: #cc7832"><font color="#cc7832">;</font></span>
    </p>
  </body>
</html>
</richcontent>
<edge COLOR="#111111" WIDTH="thin"/>
</node>
</node>
<node COLOR="#111111" CREATED="1557726847105" FOLDED="true" ID="ID_652433312" MODIFIED="1557728831118" TEXT="Service">
<edge COLOR="#111111" WIDTH="thin"/>
<node COLOR="#111111" CREATED="1557726889027" ID="ID_1918508037" MODIFIED="1557728800031">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <span style="color: #cc7832"><font color="#cc7832">public </font></span>Many2OneEmployee <span style="color: #ffc66d"><font color="#ffc66d">addEmployee</font></span>(String name<span style="color: #cc7832"><font color="#cc7832">, long </font></span>salary<span style="color: #cc7832"><font color="#cc7832">, </font></span>String departmentName) {<br />&#160;&#160;&#160; Many2OneEmployee emp = <span style="color: #cc7832"><font color="#cc7832">new </font></span>Many2OneEmployee()<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160; </span></font>Many2OneDepartment many2OneDepartment = <span style="color: #cc7832"><font color="#cc7832">new </font></span>Many2OneDepartment()<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160; </span></font>many2OneDepartment.setName(departmentName)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160;&#160; </span></font><span style="color: #9876aa"><font color="#9876aa">em</font></span>.persist(many2OneDepartment)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160; </span></font>emp.setName(name)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160; </span></font>emp.setSalary(salary)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160; </span></font>emp.setMany2OneDepartment(many2OneDepartment)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160; </span></font><span style="color: #9876aa"><font color="#9876aa">em</font></span>.persist(emp)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160;&#160;return </span></font>emp<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span>}<br /><br /><span style="color: #cc7832"><font color="#cc7832">public </font></span>Many2OneEmployee <span style="color: #ffc66d"><font color="#ffc66d">createEmployee</font></span>(String name<span style="color: #cc7832"><font color="#cc7832">, long </font></span>salary<span style="color: #cc7832"><font color="#cc7832">, int </font></span>dept_id) {<br />&#160;&#160;&#160;&#160;Many2OneEmployee emp = <span style="color: #cc7832"><font color="#cc7832">null;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160; </span></font>Many2OneDepartment dept = <span style="color: #9876aa"><font color="#9876aa">em</font></span>.find(Many2OneDepartment.<span style="color: #cc7832"><font color="#cc7832">class, </font></span>dept_id)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160;&#160;if</span></font>(dept != <span style="color: #cc7832"><font color="#cc7832">null</font></span>) {<br />&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;emp = <span style="color: #cc7832"><font color="#cc7832">new </font></span>Many2OneEmployee()<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160;&#160;&#160;&#160;&#160; </span></font>emp.setName(name)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160;&#160;&#160;&#160;&#160; </span></font>emp.setSalary(salary)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160;&#160;&#160;&#160;&#160; </span></font>emp.setMany2OneDepartment(dept)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160;&#160;&#160;&#160;&#160; </span></font><span style="color: #9876aa"><font color="#9876aa">em</font></span>.persist(emp)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160; </span></font>}<br />&#160;&#160;&#160; <span style="color: #cc7832"><font color="#cc7832">return </font></span>emp<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span>}<br /><br /><span style="color: #cc7832"><font color="#cc7832">public </font></span>Many2OneDepartment <span style="color: #ffc66d"><font color="#ffc66d">createDept</font></span>(String name) {<br />&#160;&#160;&#160; Many2OneDepartment dept = <span style="color: #cc7832"><font color="#cc7832">new </font></span>Many2OneDepartment()<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160; </span></font>dept.setName(name)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160; </span></font><span style="color: #9876aa"><font color="#9876aa">em</font></span>.persist(dept)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160;&#160;return </span></font>dept<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span>}<br /><br /><span style="color: #cc7832"><font color="#cc7832">public </font></span>Many2OneEmployee <span style="color: #ffc66d"><font color="#ffc66d">addDeptAndEmployee</font></span>(String name<span style="color: #cc7832"><font color="#cc7832">, long </font></span>salary<span style="color: #cc7832"><font color="#cc7832">, </font></span>String dept_name) {<br />&#160;&#160;&#160;&#160;Many2OneEmployee emp = <span style="color: #cc7832"><font color="#cc7832">new </font></span>Many2OneEmployee()<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160; </span></font>Many2OneDepartment many2OneDepartment = createDept(dept_name)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160; </span></font>emp.setName(name)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160; </span></font>emp.setSalary(salary)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160; </span></font>emp.setMany2OneDepartment(many2OneDepartment)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160; </span></font><span style="color: #9876aa"><font color="#9876aa">em</font></span>.persist(emp)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160;&#160;return </span></font>emp<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span>}
    </p>
  </body>
</html>
</richcontent>
<edge COLOR="#111111" WIDTH="thin"/>
</node>
</node>
<node COLOR="#111111" CREATED="1557726852455" FOLDED="true" ID="ID_926830710" MODIFIED="1557728834666" TEXT="Test">
<edge COLOR="#111111" WIDTH="thin"/>
<node COLOR="#111111" CREATED="1557726985326" ID="ID_962378337" MODIFIED="1557728800031">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <span style="color: #cc7832"><font color="#cc7832">public class </font></span>ManyToOneTest {<br />&#160;&#160;&#160;&#160; <span style="color: #cc7832"><font color="#cc7832">public static void </font></span><span style="color: #ffc66d"><font color="#ffc66d">main</font></span>(String[] args) {<br />&#160; &#160;&#160;&#160;&#160;&#160;&#160;EntityManagerFactory emf =<br />&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160;&#160; &#160;&#160;&#160;Persistence.createEntityManagerFactory(<span style="color: #6a8759"><font color="#6a8759">&quot;EmployeeService&quot;</font></span>)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160;&#160;&#160;&#160;&#160; </span></font>EntityManager em = emf.createEntityManager()<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160;&#160;&#160;&#160;&#160; </span></font>ManyToOneService ms = <span style="color: #cc7832"><font color="#cc7832">new </font></span>ManyToOneService(em)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832"><br /></span><span style="color: #cc7832">&#160;&#160;&#160;&#160;&#160;&#160;&#160; </span></font><span style="color: #808080"><font color="#808080">// &#160;create and persist an employee<br /></font></span><font color="#808080"><span style="color: #808080">&#160;&#160;&#160;&#160;&#160;&#160;&#160; </span></font>em.getTransaction().begin()<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><span style="color: #808080"><font color="#808080">// &#160;&#160;&#160;&#160;&#160;&#160;&#160;Many2OneEmployee emp = ms.addEmployee(&quot;Tasche&quot;, 100000, &quot;IT&quot;);<br /></font></span><font color="#808080"><span style="color: #808080">// &#160;&#160;&#160;&#160;&#160;&#160;&#160;Many2OneEmployee emp = ms.createEmployee(&quot;Tatze&quot;, 100000, 2);<br /></span><span style="color: #808080">&#160; &#160;&#160;&#160;&#160;&#160;&#160; </span></font>Many2OneEmployee emp = ms.addDeptAndEmployee(<span style="color: #6a8759"><font color="#6a8759">&quot;Hugo&quot;</font></span><span style="color: #cc7832"><font color="#cc7832">, </font></span><span style="color: #6897bb"><font color="#6897bb">100000</font></span><span style="color: #cc7832"><font color="#cc7832">, </font></span><span style="color: #6a8759"><font color="#6a8759">&quot;Auto&quot;</font></span>)<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160;&#160;&#160;&#160;&#160; </span></font>em.getTransaction().commit()<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832"><br /></span><span style="color: #cc7832">&#160; &#160;&#160;&#160;&#160;&#160;&#160; </span></font>System.<span style="color: #9876aa"><font color="#9876aa">out</font></span>.println(emp.toString())<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160; &#160;&#160;&#160;&#160;&#160;&#160; </span></font>em.close()<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160;&#160;&#160;&#160; &#160;</span></font>emf.close()<span style="color: #cc7832"><font color="#cc7832">;<br /></font></span><font color="#cc7832"><span style="color: #cc7832">&#160;&#160;&#160; </span></font>}<br />}
    </p>
  </body>
</html>
</richcontent>
<edge COLOR="#111111" WIDTH="thin"/>
</node>
</node>
</node>
</node>
</node>
<node COLOR="#00b439" CREATED="1557728759136" ID="ID_1284768502" MODIFIED="1557728776869" POSITION="left" TEXT="Collection">
<edge COLOR="#00b439" WIDTH="2"/>
</node>
</node>
</map>
