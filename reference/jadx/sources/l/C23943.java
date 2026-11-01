package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩻᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23943 implements InterfaceC22386, Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2629 f77660;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22386 f77661;

    public C23943(InterfaceC2629 interfaceC2629, InterfaceC22386 interfaceC22386) {
        C13465.m32966(interfaceC22386, "left");
        C13465.m32966(interfaceC2629, "element");
        this.f77661 = interfaceC22386;
        this.f77660 = interfaceC2629;
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2629 mo4416(InterfaceC5452 interfaceC5452) {
        C13465.m32966(interfaceC5452, "key");
        C23943 c23943 = this;
        while (true) {
            InterfaceC2629 interfaceC2629Mo4416 = c23943.f77660.mo4416(interfaceC5452);
            if (interfaceC2629Mo4416 != null) {
                return interfaceC2629Mo4416;
            }
            InterfaceC22386 interfaceC22386 = c23943.f77661;
            if (interfaceC22386 instanceof C23943) {
                c23943 = (C23943) interfaceC22386;
            } else {
                return interfaceC22386.mo4416(interfaceC5452);
            }
        }
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ InterfaceC22386 mo4417(InterfaceC22386 interfaceC22386) {
        return C13920.m33760(this, interfaceC22386);
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4415(Object obj, InterfaceC8400 interfaceC8400) {
        return interfaceC8400.mo3208(this.f77661.mo4415(obj, interfaceC8400), this.f77660);
    }

    @Override // l.InterfaceC22386
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC22386 mo4418(InterfaceC5452 interfaceC5452) {
        C13465.m32966(interfaceC5452, "key");
        InterfaceC2629 interfaceC2629 = this.f77660;
        InterfaceC2629 interfaceC2629Mo4416 = interfaceC2629.mo4416(interfaceC5452);
        InterfaceC22386 interfaceC22386 = this.f77661;
        if (interfaceC2629Mo4416 != null) {
            return interfaceC22386;
        }
        InterfaceC22386 interfaceC22386Mo4418 = interfaceC22386.mo4418(interfaceC5452);
        if (interfaceC22386Mo4418 == interfaceC22386) {
            return this;
        }
        return interfaceC22386Mo4418 == C1218.f5350 ? interfaceC2629 : new C23943(interfaceC2629, interfaceC22386Mo4418);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final int m52778() {
        int i = 2;
        C23943 c23943 = this;
        while (true) {
            InterfaceC22386 interfaceC22386 = c23943.f77661;
            c23943 = interfaceC22386 instanceof C23943 ? (C23943) interfaceC22386 : null;
            if (c23943 == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zM32965;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23943) {
            C23943 c23943 = (C23943) obj;
            if (c23943.m52778() == m52778()) {
                C23943 c23944 = this;
                while (true) {
                    InterfaceC2629 interfaceC2629 = c23944.f77660;
                    if (!C13465.m32965(c23943.mo4416(interfaceC2629.getKey()), interfaceC2629)) {
                        zM32965 = false;
                        break;
                    }
                    InterfaceC22386 interfaceC22386 = c23944.f77661;
                    if (interfaceC22386 instanceof C23943) {
                        c23944 = (C23943) interfaceC22386;
                    } else {
                        C13465.m32963((Object) interfaceC22386, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC2629 interfaceC26210 = (InterfaceC2629) interfaceC22386;
                        zM32965 = C13465.m32965(c23943.mo4416(interfaceC26210.getKey()), interfaceC26210);
                        break;
                    }
                }
                if (zM32965) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f77660.hashCode() + this.f77661.hashCode();
    }

    public final String toString() {
        return "[" + ((String) mo4415("", new C6303())) + ']';
    }

    private final Object writeReplace() {
        int iM52778 = m52778();
        final InterfaceC22386[] interfaceC22386Arr = new InterfaceC22386[iM52778];
        final C21931 c21931 = new C21931();
        mo4415(C7321.f24318, new InterfaceC8400() { // from class: l.ܿ᩷۠
            @Override // l.InterfaceC8400
            /* JADX INFO: renamed from: ۙ */
            public final Object mo3208(Object obj, Object obj2) {
                InterfaceC2629 interfaceC2629 = (InterfaceC2629) obj2;
                C13465.m32966((C7321) obj, "<unused var>");
                C13465.m32966(interfaceC2629, "element");
                C21931 c21932 = c21931;
                int i = c21932.f71137;
                c21932.f71137 = i + 1;
                interfaceC22386Arr[i] = interfaceC2629;
                return C7321.f24318;
            }
        });
        if (c21931.f71137 != iM52778) {
            throw new IllegalStateException("Check failed.");
        }
        return new C11243(interfaceC22386Arr);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
