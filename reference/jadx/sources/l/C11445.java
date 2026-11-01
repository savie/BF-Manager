package l;

import android.media.AudioDeviceInfo;
import android.net.Uri;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11445 implements InterfaceC2918, InterfaceC15954, InterfaceC0166 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ AudioDeviceInfo m28556(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static JSONObject m28557(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) {
        return jSONObject2.add(str2, C10413.m26317(jSONObject.get(str)));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static List m28558() {
        return C0561.synchronizedList(new ArrayList());
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC0166 mo1320() {
        return this;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC0166 mo1321(C11164 c11164) {
        return this;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC0166 mo1322(boolean z) {
        return this;
    }

    @Override // l.InterfaceC2918
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC5263 mo8743(InterfaceC15992 interfaceC15992, InterfaceC14113 interfaceC14113, InterfaceC9270 interfaceC9270) {
        return new C18441(interfaceC15992, interfaceC14113, interfaceC9270);
    }

    @Override // l.InterfaceC15954
    public Object apply(Object obj) {
        int i = ActivityC4471.f15883;
        ((Throwable) obj).getClass();
        return null;
    }

    @Override // l.InterfaceC0166
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC10045[] mo1323(Uri uri, Map map) {
        return m28559();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC10045[] m28559() {
        return new InterfaceC10045[]{new C15130(2, 1, InterfaceC13302.f44171, new C6694(C17492.FOREVER_NS), new C4149(24))};
    }
}
