package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ᩳ᩹ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B5C */
/* JADX INFO: loaded from: classes4.dex */
public class C18342 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f58510;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f58511;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m42597(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObjectAdd = JSON.object().add("type", "object").add("additionalProperties", false).add("properties", jSONObject);
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONObject.names().iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return jSONObjectAdd.add(AnnotationHandler.REQUIRED, jSONArrayArray);
    }
}
