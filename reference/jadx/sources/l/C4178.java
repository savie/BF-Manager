package l;

/* JADX INFO: renamed from: l.ۘ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 31AV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4178 extends AbstractC7707 {
    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean mo11825() {
        return false;
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo11823() {
        this.f25501.m15462();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11820(C5590 c5590) {
        C5590 c5591 = this.f25501;
        c5591.f19195.add(c5590);
        c5590.f19189.add(c5591);
    }

    @Override // l.AbstractC7707, l.InterfaceC14058
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11822(InterfaceC14058 interfaceC14058) {
        C5590 c5590 = this.f25501;
        if (c5590.f19197 && !c5590.f19187) {
            C5590 c5591 = (C5590) c5590.f19189.get(0);
            c5590.mo15463((int) ((((C12253) this.f25504).m30463() * c5591.f19196) + 0.5f));
        }
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11821() {
        C12253 c12253 = (C12253) this.f25504;
        int iM30467 = c12253.m30467();
        int iM30460 = c12253.m30460();
        int iM30459 = c12253.m30459();
        C5590 c5590 = this.f25501;
        if (iM30459 == 1) {
            if (iM30467 != -1) {
                c5590.f19189.add(this.f25504.f67433.f67376.f25501);
                this.f25504.f67433.f67376.f25501.f19195.add(c5590);
                c5590.f19193 = iM30467;
            } else if (iM30460 != -1) {
                c5590.f19189.add(this.f25504.f67433.f67376.f25505);
                this.f25504.f67433.f67376.f25505.f19195.add(c5590);
                c5590.f19193 = -iM30460;
            } else {
                c5590.f19190 = true;
                c5590.f19189.add(this.f25504.f67433.f67376.f25505);
                this.f25504.f67433.f67376.f25505.f19195.add(c5590);
            }
            m11820(this.f25504.f67376.f25501);
            m11820(this.f25504.f67376.f25505);
            return;
        }
        if (iM30467 != -1) {
            c5590.f19189.add(this.f25504.f67433.f67409.f25501);
            this.f25504.f67433.f67409.f25501.f19195.add(c5590);
            c5590.f19193 = iM30467;
        } else if (iM30460 != -1) {
            c5590.f19189.add(this.f25504.f67433.f67409.f25505);
            this.f25504.f67433.f67409.f25505.f19195.add(c5590);
            c5590.f19193 = -iM30460;
        } else {
            c5590.f19190 = true;
            c5590.f19189.add(this.f25504.f67433.f67409.f25505);
            this.f25504.f67433.f67409.f25505.f19195.add(c5590);
        }
        m11820(this.f25504.f67409.f25501);
        m11820(this.f25504.f67409.f25505);
    }

    @Override // l.AbstractC7707
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo11824() {
        int iM30459 = ((C12253) this.f25504).m30459();
        C5590 c5590 = this.f25501;
        if (iM30459 == 1) {
            this.f25504.m46638(c5590.f19196);
        } else {
            this.f25504.m46610(c5590.f19196);
        }
    }
}
