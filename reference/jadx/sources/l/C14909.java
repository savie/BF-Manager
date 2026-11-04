package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONHandler;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;

/* JADX INFO: renamed from: l.ܰ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AV2 */
/* JADX INFO: loaded from: classes5.dex */
public class C14909 extends JSONHandler {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONValue f48695;

    @Override // bin.mt.json.JSONHandler
    public JSONArray startArray() {
        return new JSONArray();
    }

    @Override // bin.mt.json.JSONHandler
    public JSONObject startObject() {
        return new JSONObject();
    }

    @Override // bin.mt.json.JSONHandler
    public void endNull() {
        this.f48695 = JSON.NULL;
    }

    @Override // bin.mt.json.JSONHandler
    public void endBoolean(boolean z) {
        this.f48695 = z ? JSON.TRUE : JSON.FALSE;
    }

    @Override // bin.mt.json.JSONHandler
    public void endString(String str) {
        this.f48695 = new C10434(str);
    }

    @Override // bin.mt.json.JSONHandler
    public void endNumber(String str) {
        this.f48695 = new C0740(str);
    }

    @Override // bin.mt.json.JSONHandler
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void endArray(JSONArray jSONArray) {
        this.f48695 = jSONArray;
    }

    @Override // bin.mt.json.JSONHandler
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void endObject(JSONObject jSONObject) {
        this.f48695 = jSONObject;
    }

    @Override // bin.mt.json.JSONHandler
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void endArrayValue(JSONArray jSONArray) {
        jSONArray.add(this.f48695);
    }

    @Override // bin.mt.json.JSONHandler
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void endObjectValue(JSONObject jSONObject, String str) {
        jSONObject.add(str, this.f48695);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public JSONValue m35866() {
        return this.f48695;
    }
}
