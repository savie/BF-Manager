package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۡܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4QJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9426 extends AbstractC16139 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9976 f30583;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6994 f30584;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15591 f30585;

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ᩸ */
    public final int mo13418() {
        return 12;
    }

    public C9426(C6994 c6994) {
        if (c6994 == null) {
            throw new NullPointerException("prototype == null");
        }
        this.f30584 = c6994;
        C13705 c13705M19309 = c6994.m19309();
        int size = c13705M19309.size();
        StringBuilder sb = new StringBuilder(size + 1);
        char cCharAt = c6994.m19308().m15375().charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i = 0; i < size; i++) {
            char cCharAt2 = c13705M19309.getType(i).m15375().charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.f30583 = new C9976(sb.toString());
        C13705 c13705M193010 = c6994.m19309();
        this.f30585 = c13705M193010.size() == 0 ? null : new C15591(c13705M193010);
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final EnumC3461 mo1454() {
        return EnumC3461.TYPE_PROTO_ID_ITEM;
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo1455(C10918 c10918) {
        C11116 c11116M27714 = c10918.m27714();
        C20067 c20067M27694 = c10918.m27694();
        C19123 c19123M27710 = c10918.m27710();
        c20067M27694.m46188(this.f30584.m19308());
        c11116M27714.m28068(this.f30583);
        C15591 c15591 = this.f30585;
        if (c15591 != null) {
            this.f30585 = (C15591) c19123M27710.m44247(c15591);
        }
    }

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ۙ */
    public final void mo13417(C10918 c10918, C15000 c15000) {
        C11116 c11116M27714 = c10918.m27714();
        C9976 c9976 = this.f30583;
        int iM28065 = c11116M27714.m28065(c9976);
        C20067 c20067M27694 = c10918.m27694();
        C6994 c6994 = this.f30584;
        int iM46184 = c20067M27694.m46184(c6994.m19308());
        C15591 c15591 = this.f30585;
        int iM26285 = c15591 == null ? 0 : c15591.m26285();
        if (c15000.m36116()) {
            StringBuilder sb = new StringBuilder();
            sb.append(c6994.m19308().mo1843());
            sb.append(" proto(");
            C13705 c13705M19309 = c6994.m19309();
            int size = c13705M19309.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(c13705M19309.getType(i).mo1843());
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c15000.m36111(0, m38318() + ' ' + sb.toString());
            c15000.m36111(4, "  shorty_idx:      " + C5306.m15938(iM28065) + " // " + c9976.m25818());
            c15000.m36111(4, "  return_type_idx: " + C5306.m15938(iM46184) + " // " + c6994.m19308().mo1843());
            c15000.m36111(4, "  parameters_off:  ".concat(C5306.m15938(iM26285)));
        }
        c15000.m36124(iM28065);
        c15000.m36124(iM46184);
        c15000.m36124(iM26285);
    }
}
