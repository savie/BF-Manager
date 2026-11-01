package l;

/* JADX INFO: renamed from: l.᩷֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20529 extends C18412 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f66507 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4651 f66508;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15591 f66509;

    public C20529(C15591 c15591, C4651 c4651) {
        this.f66509 = c15591;
        this.f66508 = c4651;
    }

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ */
    public final void mo19016(int i, int i2) {
        this.f66508.m12837(this.f66509.f50708, i, i2);
    }

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ */
    public final void mo19018(int i, int i2, int i3, boolean z) {
        byte b = EnumC19118.DBG_START_LOCAL.f61769;
        C4651 c4651 = this.f66508;
        c4651.m12841(b);
        C15591 c15591 = this.f66509;
        if (c15591.f30808.m29978() && z) {
            c4651.m12838(i);
        } else {
            c4651.m12842(i);
        }
        if (i2 != -1) {
            AbstractC9011[] abstractC9011Arr = c15591.f50706;
            int i4 = this.f66507;
            this.f66507 = i4 + 1;
            c4651.m12842(abstractC9011Arr[i4].f30809 + 1);
        } else {
            c4651.m12841(0);
        }
        if (i3 != -1) {
            AbstractC9011[] abstractC9011Arr2 = c15591.f50706;
            int i5 = this.f66507;
            this.f66507 = i5 + 1;
            c4651.m12842(abstractC9011Arr2[i5].f30809 + 1);
            return;
        }
        c4651.m12841(0);
    }

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ */
    public final void mo19017(int i, int i2, int i3, int i4, boolean z) {
        byte b = EnumC19118.DBG_START_LOCAL_EXTENDED.f61769;
        C4651 c4651 = this.f66508;
        c4651.m12841(b);
        C15591 c15591 = this.f66509;
        if (c15591.f30808.m29978() && z) {
            c4651.m12838(i);
        } else {
            c4651.m12842(i);
        }
        if (i2 != -1) {
            AbstractC9011[] abstractC9011Arr = c15591.f50706;
            int i5 = this.f66507;
            this.f66507 = i5 + 1;
            c4651.m12842(abstractC9011Arr[i5].f30809 + 1);
        } else {
            c4651.m12841(0);
        }
        if (i3 != -1) {
            AbstractC9011[] abstractC9011Arr2 = c15591.f50706;
            int i6 = this.f66507;
            this.f66507 = i6 + 1;
            c4651.m12842(abstractC9011Arr2[i6].f30809 + 1);
        } else {
            c4651.m12841(0);
        }
        if (i4 != -1) {
            AbstractC9011[] abstractC9011Arr3 = c15591.f50706;
            int i7 = this.f66507;
            this.f66507 = i7 + 1;
            c4651.m12842(abstractC9011Arr3[i7].f30809 + 1);
            return;
        }
        c4651.m12841(0);
    }

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ */
    public final void mo19015(int i) {
        byte b = EnumC19118.DBG_SET_FILE.f61769;
        C4651 c4651 = this.f66508;
        c4651.m12841(b);
        if (i != -1) {
            AbstractC9011[] abstractC9011Arr = this.f66509.f50706;
            int i2 = this.f66507;
            this.f66507 = i2 + 1;
            c4651.m12842(abstractC9011Arr[i2].f30809 + 1);
            return;
        }
        c4651.m12841(0);
    }
}
