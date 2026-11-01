package l;

import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12118 extends AbstractC6741 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final Map f40575;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final Set f40576;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final C7178 f40577;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final Map f40578;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final Map f40579;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final Set f40580;

    public C12118(C7884 c7884) {
        this.f40577 = c7884.f25924;
        this.f40576 = C0561.unmodifiableSet(c7884.f25920);
        this.f40578 = C0561.unmodifiableMap(c7884.f25926);
        this.f40579 = C0561.unmodifiableMap(c7884.f25918);
        this.f40580 = C0561.unmodifiableSet(c7884.f25923);
        this.f40575 = C0561.unmodifiableMap(c7884.f25925);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m30161() {
        return (String) this.f40577.f43680;
    }

    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        C9030.stream(this.f40576).forEach(new Consumer() { // from class: l.᩹ۖۤ
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C1455.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                String str;
                C19173 c19173 = (C19173) obj;
                String strM18212 = this.f71325.m18212(9, "requires");
                StringBuilder sb2 = sb;
                sb2.append(strM18212);
                sb2.append(c19173);
                if (c19173.m38522() == null) {
                    str = "";
                } else {
                    str = " // @" + c19173.m38522();
                }
                sb2.append(String.format(";%s%n", str));
            }
        });
        Map map = this.f40578;
        C9030.stream(map.entrySet()).filter(new C19665(6)).map(new C18467(0, this)).forEach(new C10578(1, sb));
        C9030.stream(map.entrySet()).filter(new C21386(3)).map(new C0827(0, this)).forEach(new C10578(1, sb));
        Map map2 = this.f40579;
        C9030.stream(map2.entrySet()).filter(new C13860()).map(new Function() { // from class: l.۬ۖۤ
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
                return this.f42693.m18212(9, "opens").concat(String.format("%s;%n", ((C20584) ((Map.Entry) obj).getKey()).toString()));
            }
        }).forEach(new C10578(1, sb));
        C9030.stream(map2.entrySet()).filter(new C22701(0)).map(new Function() { // from class: l.ܶۖۤ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo33696andThen(Function function) {
                return C4277.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C12118 c12118 = this.f48721;
                Map.Entry entry = (Map.Entry) obj;
                return c12118.m18212(9, "opens").concat(String.format("%s to%n%s;%n", ((C20584) entry.getKey()).toString(), C9030.stream((Set) entry.getValue()).map(new C2569(c12118, 1)).collect(C1890.joining(",\n"))));
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C4277.$default$compose(this, function);
            }
        }).forEach(new C10578(1, sb));
        C9030.stream(this.f40580).map(new C21289(0, this)).forEach(new C10578(1, sb));
        C9030.stream(this.f40575.entrySet()).filter(new C18959(2)).map(new C17761(0, this)).forEach(new C10578(1, sb));
        if (sb.length() > 0 && Character.isWhitespace(sb.charAt(sb.length() - 1))) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
