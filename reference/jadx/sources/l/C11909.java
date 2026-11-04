package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 46C7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11909 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1610 f38375;

    public C11909(C1610 c1610) {
        this.f38375 = c1610;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29849(AbstractC12531 abstractC12531, AbstractC12531 abstractC12532, InterfaceC2215 interfaceC2215) {
        C24927 declaringClass;
        C24927 declaringClass2;
        if (abstractC12531 instanceof C24927) {
            declaringClass = (C24927) abstractC12531;
        } else {
            declaringClass = abstractC12531.getDeclaringClass();
        }
        if (abstractC12532 instanceof C24927) {
            declaringClass2 = (C24927) abstractC12532;
        } else {
            declaringClass2 = abstractC12532.getDeclaringClass();
        }
        if (declaringClass.equals(declaringClass2) || declaringClass.m55556().equals(declaringClass2.m55556())) {
            return;
        }
        if (declaringClass.m55562().equals(declaringClass2.m55562())) {
            do {
                if (abstractC12531.mo8547().m26549()) {
                    interfaceC2215.mo7565(abstractC12531, 0);
                }
                abstractC12531 = abstractC12531.getDeclaringClass();
            } while (abstractC12531 != null);
            return;
        }
        do {
            C10293 c10293M26545 = abstractC12531.mo8547().m26545();
            if (!c10293M26545.m26542()) {
                boolean zM26549 = c10293M26545.m26549();
                C1610 c1610 = this.f38375;
                int i = 1;
                if (zM26549 || c10293M26545.m26536()) {
                    final C24927 declaringClass3 = abstractC12531.getDeclaringClass();
                    if (declaringClass3 != null && C1170.stream(c1610.m5691().m49227(declaringClass2.m55569())).anyMatch(new Predicate() { // from class: l.ۚ᩸᩵
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19025.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo7134negate() {
                            return C19025.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19025.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((String) obj).equals(declaringClass3.m55569());
                        }
                    })) {
                        i = 4;
                    }
                    interfaceC2215.mo7565(abstractC12531, i);
                } else if (c10293M26545.m26541()) {
                    final C24927 declaringClass4 = abstractC12531.getDeclaringClass();
                    if (declaringClass4 == null || !C1170.stream(c1610.m5691().m49227(declaringClass2.m55569())).anyMatch(new Predicate() { // from class: l.ۚ᩸᩵
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19025.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo7134negate() {
                            return C19025.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19025.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((String) obj).equals(declaringClass4.m55569());
                        }
                    })) {
                        interfaceC2215.mo7565(abstractC12531, 1);
                    }
                } else {
                    throw new C8597(c10293M26545 + " is not supported");
                }
            }
            abstractC12531 = abstractC12531.getDeclaringClass();
        } while (abstractC12531 != null);
    }
}
