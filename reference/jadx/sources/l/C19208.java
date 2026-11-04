package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩳܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes5.dex */
public final class C19208 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f62125;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f62126;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f62127;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10257 f62128;

    public C19208(C10257 c10257, AbstractC22044 abstractC22044, String str) {
        this.f62128 = c10257;
        this.f62126 = abstractC22044;
        this.f62127 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream m44523(int i, int i2) {
        String strM26446 = C10257.m26446(i, i2, this.f62127);
        this.f62128.mo29447(strM26446);
        AbstractC22044 abstractC22044M49868 = this.f62126.m49868(strM26446);
        this.f62125 = abstractC22044M49868;
        return abstractC22044M49868.mo4289(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44525() {
        AbstractC22044 abstractC22044 = this.f62125;
        if (abstractC22044 != null) {
            this.f62128.f32755.add(abstractC22044.getName());
            this.f62125 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44524() {
        AbstractC22044 abstractC22044 = this.f62125;
        if (abstractC22044 != null) {
            abstractC22044.mo4296();
            this.f62125 = null;
        }
    }
}
