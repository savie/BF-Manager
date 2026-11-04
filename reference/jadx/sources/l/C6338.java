package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.search.SearchBar;

/* JADX INFO: renamed from: l.ۛۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96RH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6338 implements InterfaceC2017, InterfaceC18006, InterfaceC5055, InterfaceC0994 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21461;

    public /* synthetic */ C6338(Object obj) {
        this.f21461 = obj;
    }

    @Override // l.InterfaceC0994
    public void onTouchExplorationStateChanged(boolean z) {
        ((SearchBar) this.f21461).lambda$new$0(z);
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        ((C13903) this.f21461).m33867((String) obj);
    }

    @Override // l.InterfaceC5055
    /* JADX INFO: renamed from: ۙ */
    public C10186 mo15291(String str, String str2, String str3) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, ((AbstractC22044) this.f21461).mo4294());
        return (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str3)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str3))) ? C10186.m26302(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C10186.m26306(str, str2, "fatal", null, jSONObjectAdd);
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        ((C8950) this.f21461).m23931(th);
    }
}
