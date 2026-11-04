package l;

import bin.mt.plus.R;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: EIX3 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0293 implements Consumer {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1610;

    public /* synthetic */ C0293(int i) {
        this.f1610 = i;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f1610) {
            case 0:
                C2551 c2551 = (C2551) obj;
                if (c2551.m8526().isEmpty()) {
                    C10293 c10293Mo8547 = c2551.mo8547();
                    boolean z = false;
                    boolean z2 = c2551.m8529() && c10293Mo8547.m26542();
                    boolean z3 = c2551.m8529() && c2551.m8536().mo17865(EnumC1763.CONVERTED_ENUM);
                    if (c2551.mo8532().m49706() && c10293Mo8547.m26540()) {
                        z = true;
                    }
                    if ((z2 || z3 || z) && C23231.m52188(c2551.m8508())) {
                        if (z) {
                            c2551.mo17866(EnumC1763.DONT_GENERATE);
                        } else if (c2551.m8509()) {
                            for (C2551 c2552 : c2551.m8536().getMethods()) {
                                if (c2552 != c2551 && c2552.m8529() && !c2552.m8509()) {
                                    break;
                                }
                            }
                            if (!c2551.mo17867(C25278.f81639)) {
                                c2551.mo17866(EnumC1763.DONT_GENERATE);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                int i = C16332.f53020;
                ((ActivityC0848) obj).m3456(R.layout.MT_Protector);
                break;
        }
    }
}
