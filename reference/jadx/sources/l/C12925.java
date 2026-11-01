package l;

import java.io.IOException;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۬ۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F3 */
/* JADX INFO: loaded from: classes4.dex */
public class C12925 implements InterfaceC6387 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC16783 f42948;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15187 f42949;

    /* JADX INFO: renamed from: ۨ */
    public int mo7125() {
        return 0;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    public C12925(C12738 c12738, EnumC16783 enumC16783) {
        this.f42948 = enumC16783;
        this.f42949 = c12738.m31655(enumC16783.m39431());
    }

    @Override // l.InterfaceC6387
    /* JADX INFO: renamed from: ۙ */
    public InterfaceC4705 mo15810(C12738 c12738) {
        C15187 c15187M31658;
        if (this instanceof C7986) {
            C7986 c7986 = (C7986) this;
            final C15187 c15187 = c7986.f26222;
            if (!c15187.mo32563() && c15187.m36398() == EnumC13776.f45426 && this.f42948.m39428() == EnumC13776.f45415) {
                C11521 c11521FindFirst = C9030.stream(c12738.f42488.values()).filter(new Predicate() { // from class: l.᩹ۛۡ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        C15187 c15188 = (C15187) obj;
                        return c15188.mo32563() && c15188.m36398() == EnumC13776.f45426 && c15188.m36400(c15187);
                    }
                }).findFirst();
                if (c11521FindFirst.isPresent()) {
                    c15187M31658 = (C15187) c11521FindFirst.get();
                } else {
                    c15187M31658 = c12738.m31658((AbstractC21536) new C16266((C15187) c15187.f49578.f69953));
                }
                c7986.f26222 = c15187M31658;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15187 mo32011(final C15187 c15187, C12738 c12738) {
        if (C0929.f3727[c15187.m36398().ordinal()] != 2 || this.f42948.m39428() != EnumC13776.f45400) {
            return c15187;
        }
        C11521 c11521FindAny = C9030.stream(c12738.f42488.values()).filter(new Predicate() { // from class: l.ۚۛۡ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C8512.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo9645negate() {
                return C8512.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C8512.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C15187 c15188 = (C15187) obj;
                return c15188.m36398() == EnumC13776.f45400 && c15188.f49578.f69953.equals(c15187);
            }
        }).findAny();
        if (c11521FindAny.isPresent()) {
            return (C15187) c11521FindAny.get();
        }
        return c12738.m31658((AbstractC21536) new C22616(c15187));
    }

    @Override // l.InterfaceC4705
    public int getLength() {
        return mo7125() + 6;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(this.f42949.f43854);
        c23509.m51771(mo7125());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC16783 m32010() {
        return this.f42948;
    }
}
