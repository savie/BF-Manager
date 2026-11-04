package l;

/* JADX INFO: renamed from: l.ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AV */
/* JADX INFO: loaded from: classes3.dex */
public final class C3143 extends AbstractC18805 {
    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo10267() {
        return false;
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo10266() {
        this.f61068.m39241();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10264(C16567 c16567) {
        C16567 c16568 = this.f61068;
        c16568.f53634.add(c16567);
        c16567.f53625.add(c16568);
    }

    @Override // l.AbstractC18805, l.InterfaceC1652
    /* JADX INFO: renamed from: ۙ */
    public final void mo5938(InterfaceC1652 interfaceC1652) {
        C16567 c16567 = this.f61068;
        if (c16567.f53631 && !c16567.f53630) {
            C16567 c16568 = (C16567) c16567.f53625.get(0);
            c16567.mo39242((int) ((((C7463) this.f61072).m20501() * c16568.f53632) + 0.5f));
        }
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10265() {
        C7463 c7463 = (C7463) this.f61072;
        int iM20497 = c7463.m20497();
        int iM20492 = c7463.m20492();
        int iM20502 = c7463.m20502();
        C16567 c16567 = this.f61068;
        if (iM20502 == 1) {
            if (iM20497 != -1) {
                c16567.f53625.add(this.f61072.f33252.f33245.f61068);
                this.f61072.f33252.f33245.f61068.f53634.add(c16567);
                c16567.f53628 = iM20497;
            } else if (iM20492 != -1) {
                c16567.f53625.add(this.f61072.f33252.f33245.f61071);
                this.f61072.f33252.f33245.f61071.f53634.add(c16567);
                c16567.f53628 = -iM20492;
            } else {
                c16567.f53626 = true;
                c16567.f53625.add(this.f61072.f33252.f33245.f61071);
                this.f61072.f33252.f33245.f61071.f53634.add(c16567);
            }
            m10264(this.f61072.f33245.f61068);
            m10264(this.f61072.f33245.f61071);
            return;
        }
        if (iM20497 != -1) {
            c16567.f53625.add(this.f61072.f33252.f33195.f61068);
            this.f61072.f33252.f33195.f61068.f53634.add(c16567);
            c16567.f53628 = iM20497;
        } else if (iM20492 != -1) {
            c16567.f53625.add(this.f61072.f33252.f33195.f61071);
            this.f61072.f33252.f33195.f61071.f53634.add(c16567);
            c16567.f53628 = -iM20492;
        } else {
            c16567.f53626 = true;
            c16567.f53625.add(this.f61072.f33252.f33195.f61071);
            this.f61072.f33252.f33195.f61071.f53634.add(c16567);
        }
        m10264(this.f61072.f33195.f61068);
        m10264(this.f61072.f33195.f61071);
    }

    @Override // l.AbstractC18805
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo10268() {
        int iM20502 = ((C7463) this.f61072).m20502();
        C16567 c16567 = this.f61068;
        if (iM20502 == 1) {
            this.f61072.m26855(c16567.f53632);
        } else {
            this.f61072.m26836(c16567.f53632);
        }
    }
}
