package l;

import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5BI */
/* JADX INFO: loaded from: classes4.dex */
public final class C10063 extends C6534 {

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f34387;

    @Override // l.C6534
    /* JADX INFO: renamed from: ᩶ */
    public final String mo17752() {
        StringBuilder sb = new StringBuilder();
        int[] iArr = C3711.f13509;
        EnumC3046 enumC3046 = this.f22000;
        switch (iArr[enumC3046.ordinal()]) {
            case 1:
                sb.append(m25473("", new Supplier() { // from class: l.ᩳۙۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        final C10063 c10063 = this.f56453;
                        return C18755.m43307(c10063.f47512.m27826(c10063.f34387, new Function() { // from class: l.ۡۙۤ
                            @Override // java.util.function.Function
                            /* JADX INFO: renamed from: andThen */
                            public /* synthetic */ Function mo33696andThen(Function function) {
                                return C4277.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public /* synthetic */ Function compose(Function function) {
                                return C4277.$default$compose(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return "#" + c10063.f34387;
                            }
                        }), "\"");
                    }
                }));
                break;
            case 2:
            case 3:
            case 5:
                sb.append(m25473(enumC3046.m9140(), new Supplier() { // from class: l.ᩴۙۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C10063 c10063 = this.f58988;
                        return c10063.f47512.m27823(c10063.f34387).mo2278();
                    }
                }));
                break;
            case 4:
            case 7:
            case 8:
            case 9:
                sb.append(m25473("", new C18550(this, 1)));
                break;
            case 6:
                sb.append(m25473(enumC3046.m9140(), new Supplier() { // from class: l.۠ۙۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C10063 c10063 = this.f26109;
                        return ((Integer) ((C20210) c10063.f47512.m27823(c10063.f34387)).f41511).intValue() == 0 ? "false" : "true";
                    }
                }));
                break;
            case 10:
                sb.append(m25473(enumC3046.m9140(), new Supplier() { // from class: l.᩵ۙۤ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C10063 c10063 = this.f62171;
                        return c10063.f47512.getName(c10063.f34387);
                    }
                }));
                break;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m25473(String str, Supplier supplier) {
        int i = this.f34387;
        String strConcat = str.isEmpty() ? "" : str.concat(" ");
        if (!this.f22692) {
            StringBuilder sbM23356 = C9023.m23356(strConcat);
            sbM23356.append((String) supplier.get());
            return sbM23356.toString();
        }
        if (this.f22704) {
            StringBuilder sbM23357 = C9023.m23356(strConcat);
            sbM23357.append(String.format("#%d", Integer.valueOf(i)));
            return sbM23357.toString();
        }
        StringBuilder sbM23358 = C9023.m23356(strConcat);
        sbM23358.append(String.format("#%d /* %s */", Integer.valueOf(i), supplier.get()));
        return sbM23358.toString();
    }

    @Override // l.C6534, l.AbstractC6741, l.InterfaceC5144
    /* JADX INFO: renamed from: ܰ */
    public final void mo3628() {
        EnumC23676 enumC23676M34921 = m34921();
        if (enumC23676M34921 == EnumC23676.HAS_DEFAULT_VALUE) {
            m18215(C22697.m50267(new StringBuilder(), m34920(), "%s }"), mo17752());
        } else if (enumC23676M34921 == EnumC23676.RIGHT_OPERAND) {
            m18215(" %s }", mo17752());
        } else {
            m18228(mo17752());
        }
    }
}
