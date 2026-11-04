package l;

/* JADX INFO: renamed from: l.ᩴۖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19516 extends C22500 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12803 f62968;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f62969;

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ */
    public final void mo33592(int i, int i2) {
        this.f72797 += i2;
    }

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ */
    public final void mo27027(int i, int i2, int i3, boolean z) {
        this.f72797++;
        C12803 c12803 = this.f62968;
        if (c12803.f34102.m55245() && z) {
            this.f72797 = C6929.m19207(i) + this.f72797;
        } else {
            this.f72797 = C6929.m19213(i) + this.f72797;
        }
        if (i2 != -1) {
            int i4 = this.f72797;
            AbstractC10739[] abstractC10739Arr = c12803.f41018;
            int i5 = this.f62969;
            this.f62969 = i5 + 1;
            this.f72797 = C6929.m19213(abstractC10739Arr[i5].f34104 + 1) + i4;
        } else {
            this.f72797++;
        }
        if (i3 != -1) {
            int i6 = this.f72797;
            AbstractC10739[] abstractC10739Arr2 = c12803.f41018;
            int i7 = this.f62969;
            this.f62969 = i7 + 1;
            this.f72797 = C6929.m19213(abstractC10739Arr2[i7].f34104 + 1) + i6;
            return;
        }
        this.f72797++;
    }

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ */
    public final void mo27026(int i, int i2, int i3, int i4, boolean z) {
        this.f72797++;
        C12803 c12803 = this.f62968;
        if (c12803.f34102.m55245() && z) {
            this.f72797 = C6929.m19207(i) + this.f72797;
        } else {
            this.f72797 = C6929.m19213(i) + this.f72797;
        }
        if (i2 != -1) {
            int i5 = this.f72797;
            AbstractC10739[] abstractC10739Arr = c12803.f41018;
            int i6 = this.f62969;
            this.f62969 = i6 + 1;
            this.f72797 = C6929.m19213(abstractC10739Arr[i6].f34104 + 1) + i5;
        } else {
            this.f72797++;
        }
        if (i3 != -1) {
            int i7 = this.f72797;
            AbstractC10739[] abstractC10739Arr2 = c12803.f41018;
            int i8 = this.f62969;
            this.f62969 = i8 + 1;
            this.f72797 = C6929.m19213(abstractC10739Arr2[i8].f34104 + 1) + i7;
        } else {
            this.f72797++;
        }
        if (i4 != -1) {
            int i9 = this.f72797;
            AbstractC10739[] abstractC10739Arr3 = c12803.f41018;
            int i10 = this.f62969;
            this.f62969 = i10 + 1;
            this.f72797 = C6929.m19213(abstractC10739Arr3[i10].f34104 + 1) + i9;
            return;
        }
        this.f72797++;
    }

    public C19516(C12803 c12803) {
        this.f62968 = c12803;
        this.f72797 = 0;
        this.f62969 = 0;
    }

    @Override // l.C13744
    /* JADX INFO: renamed from: ۙ */
    public final void mo27025(int i) {
        int i2 = this.f72797;
        int i3 = i2 + 1;
        this.f72797 = i3;
        if (i != -1) {
            AbstractC10739[] abstractC10739Arr = this.f62968.f41018;
            int i4 = this.f62969;
            this.f62969 = i4 + 1;
            this.f72797 = C6929.m19213(abstractC10739Arr[i4].f34104 + 1) + i3;
            return;
        }
        this.f72797 = i2 + 2;
    }
}
