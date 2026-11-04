package l;

/* JADX INFO: renamed from: l.ܳۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes5.dex */
public final class C15040 extends C13744 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49092 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24166 f49093;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12803 f49094;

    public C15040(C12803 c12803, C24166 c24166) {
        this.f49094 = c12803;
        this.f49093 = c24166;
    }

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ */
    public final void mo33592(int i, int i2) {
        this.f49093.m54133(this.f49094.f41017, i, i2);
    }

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ */
    public final void mo27027(int i, int i2, int i3, boolean z) {
        byte b = EnumC21754.DBG_START_LOCAL.f69390;
        C24166 c24166 = this.f49093;
        c24166.m54138(b);
        C12803 c12803 = this.f49094;
        if (c12803.f34102.m55245() && z) {
            c24166.m54136(i);
        } else {
            c24166.m54135(i);
        }
        if (i2 != -1) {
            AbstractC10739[] abstractC10739Arr = c12803.f41018;
            int i4 = this.f49092;
            this.f49092 = i4 + 1;
            c24166.m54135(abstractC10739Arr[i4].f34104 + 1);
        } else {
            c24166.m54138(0);
        }
        if (i3 != -1) {
            AbstractC10739[] abstractC10739Arr2 = c12803.f41018;
            int i5 = this.f49092;
            this.f49092 = i5 + 1;
            c24166.m54135(abstractC10739Arr2[i5].f34104 + 1);
            return;
        }
        c24166.m54138(0);
    }

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ */
    public final void mo27026(int i, int i2, int i3, int i4, boolean z) {
        byte b = EnumC21754.DBG_START_LOCAL_EXTENDED.f69390;
        C24166 c24166 = this.f49093;
        c24166.m54138(b);
        C12803 c12803 = this.f49094;
        if (c12803.f34102.m55245() && z) {
            c24166.m54136(i);
        } else {
            c24166.m54135(i);
        }
        if (i2 != -1) {
            AbstractC10739[] abstractC10739Arr = c12803.f41018;
            int i5 = this.f49092;
            this.f49092 = i5 + 1;
            c24166.m54135(abstractC10739Arr[i5].f34104 + 1);
        } else {
            c24166.m54138(0);
        }
        if (i3 != -1) {
            AbstractC10739[] abstractC10739Arr2 = c12803.f41018;
            int i6 = this.f49092;
            this.f49092 = i6 + 1;
            c24166.m54135(abstractC10739Arr2[i6].f34104 + 1);
        } else {
            c24166.m54138(0);
        }
        if (i4 != -1) {
            AbstractC10739[] abstractC10739Arr3 = c12803.f41018;
            int i7 = this.f49092;
            this.f49092 = i7 + 1;
            c24166.m54135(abstractC10739Arr3[i7].f34104 + 1);
            return;
        }
        c24166.m54138(0);
    }

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ */
    public final void mo27025(int i) {
        byte b = EnumC21754.DBG_SET_FILE.f69390;
        C24166 c24166 = this.f49093;
        c24166.m54138(b);
        if (i != -1) {
            AbstractC10739[] abstractC10739Arr = this.f49094.f41018;
            int i2 = this.f49092;
            this.f49092 = i2 + 1;
            c24166.m54135(abstractC10739Arr[i2].f34104 + 1);
            return;
        }
        c24166.m54138(0);
    }
}
