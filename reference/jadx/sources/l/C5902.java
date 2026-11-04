package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚ᩶᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: NB3C */
/* JADX INFO: loaded from: classes3.dex */
public final class C5902 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f20204;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23056 f20205;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f20206;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f20207;

    public C5902() {
        throw null;
    }

    public C5902(String str, String str2, C23056 c23056) {
        this.f20207 = str;
        this.f20204 = str2;
        this.f20205 = c23056;
        this.f20206 = null;
    }

    public C5902(String str, CharSequence charSequence, int i) {
        this.f20207 = charSequence;
        this.f20204 = str;
        this.f20205 = new C23056(0, i, false, 0, null, null, null);
        this.f20206 = null;
    }

    public C5902(CharSequence charSequence, String str, ArrayList arrayList, int i) {
        this.f20207 = charSequence;
        this.f20204 = str;
        this.f20205 = new C23056(0, i, false, 0, null, null, null);
        this.f20206 = arrayList;
    }

    public C5902(String str, boolean z, int i, AbstractC22044 abstractC22044, C21246 c21246, HashMap map) {
        this.f20207 = str;
        this.f20204 = "\n";
        this.f20205 = new C23056(255, 0, z, i, abstractC22044, c21246, map);
        this.f20206 = null;
    }

    public C5902(String str, int i) {
        this.f20207 = str;
        this.f20204 = "\n";
        this.f20205 = new C23056(i, 0, false, 0, null, null, null);
        this.f20206 = null;
    }
}
