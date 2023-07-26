package Service.JuniorResearchInvestigator;

import Bean.DistinguishedProfessor.DistinguishedProfessorTableA.*;
import Dao.Admin.AwardYearDAO;
import Dao.Admin.Impl.AwardYearDAOImpl;
import Dao.DistinguishedProfessor.Impl.DistinguishedProfessorTableA.*;
import Dao.DistinguishedProfessor.DistinguishedProfessorTableA.*;
import fr.opensagres.xdocreport.document.json.JSONObject;

import static Utils.ReflectUtils.addBeanPropertyToJson;

public class JuniorResearchInvestigatorTableAService {
    private ArticleAADAO articleAADAO = new ArticleAADAOImpl();
    private ArticleABDAO articleABDAO = new ArticleABDAOImpl();
    private ArticleSWDAO articleSWDAO = new ArticleSWDAOImpl();
    private ArticleTTDAO articleTTDAO = new ArticleTTDAOImpl();
    private CoopProjectDAO coopProjectDAO = new CoopProjectDAOImpl();
    private OtherDataDAO otherDataDAO = new OtherDataDAOImpl();
    private TechProjectDAO techProjectDAO = new TechProjectDAOImpl();
    private TechTransferDAO techTransferDAO = new TechTransferDAOImpl();
    private AwardYearDAO awardYearDAO = new AwardYearDAOImpl();

    public void save(JSONObject jsonObject, String projectId){
        ArticleAA aaa = new ArticleAA(
                jsonObject.getString("a_article_count1"),
                jsonObject.getString("a_article_count2"),
                jsonObject.getString("a_article_count3"),
                null,
                null,
                jsonObject.getString("a_article_count_total"),
                jsonObject.getString("a_article_point1"),
                jsonObject.getString("a_article_point2"),
                jsonObject.getString("a_article_point3"),
                null,
                null,
                jsonObject.getString("a_article_point_total")
        );
        ArticleAB aab = new ArticleAB(
                jsonObject.getString("a_book_count1"),
                jsonObject.getString("a_book_count2"),
                jsonObject.getString("a_book_count3"),
                null,
                null,
                jsonObject.getString("a_book_count_total"),
                jsonObject.getString("a_book_point1"),
                jsonObject.getString("a_book_point2"),
                jsonObject.getString("a_book_point3"),
                null,
                null,
                jsonObject.getString("a_book_point_total")
        );
        ArticleSW asw = new ArticleSW(
                jsonObject.getString("sw_article_count1"),
                jsonObject.getString("sw_article_count2"),
                jsonObject.getString("sw_article_count3"),
                null,
                null,
                jsonObject.getString("sw_article_count_total"),
                jsonObject.getString("sw_point1"),
                jsonObject.getString("sw_point2"),
                jsonObject.getString("sw_point3"),
                null,
                null,
                jsonObject.getString("sw_point_total"),
                jsonObject.getString("fwci_value"),
                jsonObject.getString("h5_index"),
                jsonObject.getString("a_plus_b_total_point")
        );
        ArticleTT att = new ArticleTT(
                jsonObject.getString("t_article_count1"),
                jsonObject.getString("t_article_count2"),
                jsonObject.getString("t_article_count3"),
                null,
                null,
                jsonObject.getString("t_article_count_total"),
                jsonObject.getString("t_point1"),
                jsonObject.getString("t_point2"),
                jsonObject.getString("t_point3"),
                null,
                null,
                jsonObject.getString("t_point_total")
        );
        CoopProject cp = new CoopProject(
                jsonObject.getString("coop_project_count1"),
                jsonObject.getString("coop_project_count2"),
                jsonObject.getString("coop_project_count3"),
                null,
                null,
                jsonObject.getString("coop_project_count_total"),
                jsonObject.getString("coop_project_management1"),
                jsonObject.getString("coop_project_management2"),
                jsonObject.getString("coop_project_management3"),
                null,
                null,
                jsonObject.getString("coop_project_management_total"),
                jsonObject.getString("coop_project_money1"),
                jsonObject.getString("coop_project_money2"),
                jsonObject.getString("coop_project_money3"),
                null,
                null,
                jsonObject.getString("coop_project_money_total"),
                jsonObject.getString("coop_project_point1"),
                jsonObject.getString("coop_project_point2"),
                jsonObject.getString("coop_project_point3"),
                null,
                null,
                jsonObject.getString("coop_project_point_total")
        );
        OtherData od = new OtherData(
                projectId,
                jsonObject.getString("other_data"),
                jsonObject.getString("commit_date")
        );
        TechProject tp = new TechProject(
                jsonObject.getString("tech_project_count1"),
                jsonObject.getString("tech_project_count2"),
                jsonObject.getString("tech_project_count3"),
                null,
                null,
                jsonObject.getString("tech_project_count_total"),
                jsonObject.getString("tech_project_money1"),
                jsonObject.getString("tech_project_money2"),
                jsonObject.getString("tech_project_money3"),
                null,
                null,
                jsonObject.getString("tech_project_money_total"),
                jsonObject.getString("tech_project_point1"),
                jsonObject.getString("tech_project_point2"),
                jsonObject.getString("tech_project_point3"),
                null,
                null,
                jsonObject.getString("tech_project_point_total")
        );
        TechTransfer tt = new TechTransfer(
                jsonObject.getString("tech_transfer_count1"),
                jsonObject.getString("tech_transfer_count2"),
                jsonObject.getString("tech_transfer_count3"),
                null,
                null,
                jsonObject.getString("tech_transfer_count_total"),
                jsonObject.getString("tech_transfer_management1"),
                jsonObject.getString("tech_transfer_management2"),
                jsonObject.getString("tech_transfer_management3"),
                null,
                null,
                jsonObject.getString("tech_transfer_management_total"),
                jsonObject.getString("tech_transfer_money1"),
                jsonObject.getString("tech_transfer_money2"),
                jsonObject.getString("tech_transfer_money3"),
                null,
                null,
                jsonObject.getString("tech_transfer_money_total"),
                jsonObject.getString("tech_transfer_point1"),
                jsonObject.getString("tech_transfer_point2"),
                jsonObject.getString("tech_transfer_point3"),
                null,
                null,
                jsonObject.getString("tech_transfer_point_total")
        );

        articleAADAO.save(aaa, projectId);
        articleABDAO.save(aab, projectId);
        articleSWDAO.save(asw, projectId);
        articleTTDAO.save(att, projectId);
        coopProjectDAO.save(cp, projectId);
        otherDataDAO.save(od, projectId);
        techProjectDAO.save(tp, projectId);
        techTransferDAO.save(tt, projectId);
    }

    public JSONObject show(String projectId) {
        ArticleAA aaa = articleAADAO.show(projectId);
        ArticleAB aab = articleABDAO.show(projectId);
        ArticleSW asw = articleSWDAO.show(projectId);
        ArticleTT att = articleTTDAO.show(projectId);
        CoopProject cp = coopProjectDAO.show(projectId);
        OtherData od = otherDataDAO.show(projectId);
        TechProject tp = techProjectDAO.show(projectId);
        TechTransfer tt = techTransferDAO.show(projectId);
        JSONObject awardYear = awardYearDAO.getSpecificAwardYears("JuniorResearchInvestigator");

        if(od == null) {
            aaa = new ArticleAA("0","0","0","0","0","0","0","0","0","0","0","0");
            aab = new ArticleAB("0","0","0","0","0","0","0","0","0","0","0","0");
            asw = new ArticleSW("0","0","0","0","0","0","0","0","0","0","0","0","0","0", "0");
            att = new ArticleTT("0","0","0","0","0","0","0","0","0","0","0","0");
            cp = new CoopProject("0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0");
            od = new OtherData(projectId,"","");
            tp = new TechProject("0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0");
            tt = new TechTransfer("0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0");
        }
        JSONObject object = new JSONObject();
        try {
            addBeanPropertyToJson(object,aaa);
            addBeanPropertyToJson(object,aab);
            addBeanPropertyToJson(object,asw);
            addBeanPropertyToJson(object,att);
            addBeanPropertyToJson(object,cp);
            addBeanPropertyToJson(object,od);
            addBeanPropertyToJson(object,tp);
            addBeanPropertyToJson(object,tt);
            object.putAll(awardYear);
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }
        return object;
    }
}
