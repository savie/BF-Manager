package l;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۙ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4899 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17181;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f17182;

    public String toString() {
        switch (this.f17181) {
            case 1:
                return ((Field) this.f17182).toString();
            default:
                return super.toString();
        }
    }

    public C4899() {
        this.f17181 = 0;
        this.f17182 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m13623(int i) {
        if (i < 0 || i > 6) {
            return;
        }
        ((LinkedHashMap) this.f17182).put(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m13624() {
        return ((LinkedHashMap) this.f17182).containsValue(4);
    }

    public C4899(Field field) {
        this.f17181 = 1;
        C13638.requireNonNull(field);
        this.f17182 = field;
    }
}
