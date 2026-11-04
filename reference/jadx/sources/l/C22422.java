package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22422 extends AbstractC20997 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final Map f72613;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final Set f72614;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final C9346 f72615;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final Set f72616;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final Map f72617;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final Map f72618;

    public C22422(C7856 c7856) {
        this.f72615 = c7856.f26171;
        this.f72614 = C4681.unmodifiableSet(c7856.f26168);
        this.f72613 = C4681.unmodifiableMap(c7856.f26176);
        this.f72618 = C4681.unmodifiableMap(c7856.f26173);
        this.f72616 = C4681.unmodifiableSet(c7856.f26172);
        this.f72617 = C4681.unmodifiableMap(c7856.f26170);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String m50567() {
        return (String) this.f72615.f61429;
    }

    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        C1170.stream(this.f72614).forEach(new Consumer() { // from class: l.᩵ۧ᩺
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                String str;
                C19043 c19043 = (C19043) obj;
                String strM47990 = this.f65753.m47990(9, "requires");
                StringBuilder sb2 = sb;
                sb2.append(strM47990);
                sb2.append(c19043);
                if (c19043.m15858() == null) {
                    str = "";
                } else {
                    str = " // @" + c19043.m15858();
                }
                sb2.append(String.format(";%s%n", str));
            }
        });
        Map map = this.f72613;
        C1170.stream(map.entrySet()).filter(new C18297(0)).map(new C2573(3, this)).forEach(new C24261(sb));
        C1170.stream(map.entrySet()).filter(new C0110(3)).map(new Function() { // from class: l.֡ۧ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C22422 c22422 = this.f1945;
                Map.Entry entry = (Map.Entry) obj;
                return c22422.m47990(9, "exports").concat(String.format("%s to%n%s;%n", ((C10092) entry.getKey()).toString(), C1170.stream((Set) entry.getValue()).map(new Function() { // from class: l.᩺ۧ᩺
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public /* synthetic */ Function mo10608andThen(Function function) {
                        return C24247.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C24247.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        C22422 c22423 = c22422;
                        c22423.getClass();
                        return c22423.m48011(9, ((C7110) obj2).toString());
                    }
                }).collect(C2025.joining(",\n"))));
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        }).forEach(new C24261(sb));
        Map map2 = this.f72618;
        C1170.stream(map2.entrySet()).filter(new C15025(4)).map(new Function() { // from class: l.ۨۧ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f39610.m47990(9, "opens").concat(String.format("%s;%n", ((C2635) ((Map.Entry) obj).getKey()).toString()));
            }
        }).forEach(new C24261(sb));
        C1170.stream(map2.entrySet()).filter(new C23144(1)).map(new C1385(3, this)).forEach(new C24261(sb));
        C1170.stream(this.f72616).map(new Function() { // from class: l.ܰۧ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f45889.m47990(9, "uses").concat(String.format("%s;%n", (C13821) obj));
            }
        }).forEach(new C24261(sb));
        C1170.stream(this.f72617.entrySet()).filter(new C17603(1)).map(new Function() { // from class: l.᩶ۧ᩺
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo10608andThen(Function function) {
                return C24247.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C22422 c22422 = this.f67843;
                Map.Entry entry = (Map.Entry) obj;
                return c22422.m47990(9, "provides").concat(String.format("%s with%n%s;%n", ((C8601) entry.getKey()).toString(), C1170.stream((Set) entry.getValue()).map(new C4127(0, c22422)).collect(C2025.joining(",\n"))));
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C24247.$default$compose(this, function);
            }
        }).forEach(new C24261(sb));
        if (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
