package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۬ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14036 implements InterfaceC11536, Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5571 f44480;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC11536 f44481;

    public C14036(InterfaceC5571 interfaceC5571, InterfaceC11536 interfaceC11536) {
        C15243.m36590(interfaceC11536, "left");
        C15243.m36590(interfaceC5571, "element");
        this.f44481 = interfaceC11536;
        this.f44480 = interfaceC5571;
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC5571 mo5005(InterfaceC1842 interfaceC1842) {
        C15243.m36590(interfaceC1842, "key");
        C14036 c14036 = this;
        while (true) {
            InterfaceC5571 interfaceC5571Mo5005 = c14036.f44480.mo5005(interfaceC1842);
            if (interfaceC5571Mo5005 != null) {
                return interfaceC5571Mo5005;
            }
            InterfaceC11536 interfaceC11536 = c14036.f44481;
            if (interfaceC11536 instanceof C14036) {
                c14036 = (C14036) interfaceC11536;
            } else {
                return interfaceC11536.mo5005(interfaceC1842);
            }
        }
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ InterfaceC11536 mo5006(InterfaceC11536 interfaceC11536) {
        return C15265.m36618(this, interfaceC11536);
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ۙ */
    public final Object mo5004(Object obj, InterfaceC23955 interfaceC23955) {
        return interfaceC23955.mo3124(this.f44481.mo5004(obj, interfaceC23955), this.f44480);
    }

    @Override // l.InterfaceC11536
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC11536 mo5007(InterfaceC1842 interfaceC1842) {
        C15243.m36590(interfaceC1842, "key");
        InterfaceC5571 interfaceC5571 = this.f44480;
        InterfaceC5571 interfaceC5571Mo5005 = interfaceC5571.mo5005(interfaceC1842);
        InterfaceC11536 interfaceC11536 = this.f44481;
        if (interfaceC5571Mo5005 != null) {
            return interfaceC11536;
        }
        InterfaceC11536 interfaceC11536Mo5007 = interfaceC11536.mo5007(interfaceC1842);
        if (interfaceC11536Mo5007 == interfaceC11536) {
            return this;
        }
        return interfaceC11536Mo5007 == C24963.f80840 ? interfaceC5571 : new C14036(interfaceC5571, interfaceC11536Mo5007);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final int m34199() {
        int i = 2;
        C14036 c14036 = this;
        while (true) {
            InterfaceC11536 interfaceC11536 = c14036.f44481;
            c14036 = interfaceC11536 instanceof C14036 ? (C14036) interfaceC11536 : null;
            if (c14036 == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zM36589;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14036) {
            C14036 c14036 = (C14036) obj;
            if (c14036.m34199() == m34199()) {
                C14036 c14037 = this;
                while (true) {
                    InterfaceC5571 interfaceC5571 = c14037.f44480;
                    if (!C15243.m36589(c14036.mo5005(interfaceC5571.getKey()), interfaceC5571)) {
                        zM36589 = false;
                        break;
                    }
                    InterfaceC11536 interfaceC11536 = c14037.f44481;
                    if (interfaceC11536 instanceof C14036) {
                        c14037 = (C14036) interfaceC11536;
                    } else {
                        C15243.m36587((Object) interfaceC11536, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC5571 interfaceC5572 = (InterfaceC5571) interfaceC11536;
                        zM36589 = C15243.m36589(c14036.mo5005(interfaceC5572.getKey()), interfaceC5572);
                        break;
                    }
                }
                if (zM36589) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44480.hashCode() + this.f44481.hashCode();
    }

    public final String toString() {
        return "[" + ((String) mo5004("", new C8816())) + ']';
    }

    private final Object writeReplace() {
        int iM34199 = m34199();
        final InterfaceC11536[] interfaceC11536Arr = new InterfaceC11536[iM34199];
        final C11514 c11514 = new C11514();
        mo5004(C11471.f36082, new InterfaceC23955() { // from class: l.ۖᩳ᩵
            @Override // l.InterfaceC23955
            /* JADX INFO: renamed from: ۙ */
            public final Object mo3124(Object obj, Object obj2) {
                InterfaceC5571 interfaceC5571 = (InterfaceC5571) obj2;
                C15243.m36590((C11471) obj, "<unused var>");
                C15243.m36590(interfaceC5571, "element");
                C11514 c11515 = c11514;
                int i = c11515.f36230;
                c11515.f36230 = i + 1;
                interfaceC11536Arr[i] = interfaceC5571;
                return C11471.f36082;
            }
        });
        if (c11514.f36230 != iM34199) {
            throw new IllegalStateException("Check failed.");
        }
        return new C7325(interfaceC11536Arr);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
