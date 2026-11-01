package l;

/* JADX INFO: renamed from: l.۟֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F5QL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7123 extends C9946 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15591 f23819;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f23820;

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19016(int i, int i2) {
        this.f33954 += i2;
    }

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19018(int i, int i2, int i3, boolean z) {
        this.f33954++;
        C15591 c15591 = this.f23819;
        if (c15591.f30808.m29978() && z) {
            this.f33954 = C13530.m33056(i) + this.f33954;
        } else {
            this.f33954 = C13530.m33072(i) + this.f33954;
        }
        if (i2 != -1) {
            int i4 = this.f33954;
            AbstractC9011[] abstractC9011Arr = c15591.f50706;
            int i5 = this.f23820;
            this.f23820 = i5 + 1;
            this.f33954 = C13530.m33072(abstractC9011Arr[i5].f30809 + 1) + i4;
        } else {
            this.f33954++;
        }
        if (i3 != -1) {
            int i6 = this.f33954;
            AbstractC9011[] abstractC9011Arr2 = c15591.f50706;
            int i7 = this.f23820;
            this.f23820 = i7 + 1;
            this.f33954 = C13530.m33072(abstractC9011Arr2[i7].f30809 + 1) + i6;
            return;
        }
        this.f33954++;
    }

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19017(int i, int i2, int i3, int i4, boolean z) {
        this.f33954++;
        C15591 c15591 = this.f23819;
        if (c15591.f30808.m29978() && z) {
            this.f33954 = C13530.m33056(i) + this.f33954;
        } else {
            this.f33954 = C13530.m33072(i) + this.f33954;
        }
        if (i2 != -1) {
            int i5 = this.f33954;
            AbstractC9011[] abstractC9011Arr = c15591.f50706;
            int i6 = this.f23820;
            this.f23820 = i6 + 1;
            this.f33954 = C13530.m33072(abstractC9011Arr[i6].f30809 + 1) + i5;
        } else {
            this.f33954++;
        }
        if (i3 != -1) {
            int i7 = this.f33954;
            AbstractC9011[] abstractC9011Arr2 = c15591.f50706;
            int i8 = this.f23820;
            this.f23820 = i8 + 1;
            this.f33954 = C13530.m33072(abstractC9011Arr2[i8].f30809 + 1) + i7;
        } else {
            this.f33954++;
        }
        if (i4 != -1) {
            int i9 = this.f33954;
            AbstractC9011[] abstractC9011Arr3 = c15591.f50706;
            int i10 = this.f23820;
            this.f23820 = i10 + 1;
            this.f33954 = C13530.m33072(abstractC9011Arr3[i10].f30809 + 1) + i9;
            return;
        }
        this.f33954++;
    }

    public C7123(C15591 c15591) {
        this.f23819 = c15591;
        this.f33954 = 0;
        this.f23820 = 0;
    }

    @Override // l.C18412
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19015(int i) {
        int i2 = this.f33954;
        int i3 = i2 + 1;
        this.f33954 = i3;
        if (i != -1) {
            AbstractC9011[] abstractC9011Arr = this.f23819.f50706;
            int i4 = this.f23820;
            this.f23820 = i4 + 1;
            this.f33954 = C13530.m33072(abstractC9011Arr[i4].f30809 + 1) + i3;
            return;
        }
        this.f33954 = i2 + 2;
    }
}
