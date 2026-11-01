package l;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28U3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9456 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C9456 f32004 = new C9456(AbstractC22433.of());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 f32005;

    static {
        C17983.m41806(0);
    }

    public C9456(List list) {
        this.f32005 = AbstractC22433.copyOf((Collection) list);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22433 m24212() {
        return this.f32005;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m24215() {
        return this.f32005.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24213(int i) {
        int i2 = 0;
        while (true) {
            AbstractC22433 abstractC22433 = this.f32005;
            if (i2 >= abstractC22433.size()) {
                return false;
            }
            if (((C1693) abstractC22433.get(i2)).m5618() == i) {
                return true;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m24214() {
        int i = 0;
        while (true) {
            AbstractC22433 abstractC22433 = this.f32005;
            if (i >= abstractC22433.size()) {
                return false;
            }
            if (((C1693) abstractC22433.get(i)).m5618() == 2 && ((C1693) abstractC22433.get(i)).m5613()) {
                return true;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m24216(int i) {
        int i2 = 0;
        while (true) {
            AbstractC22433 abstractC22433 = this.f32005;
            if (i2 >= abstractC22433.size()) {
                return false;
            }
            C1693 c1693 = (C1693) abstractC22433.get(i2);
            if (c1693.m5617() && c1693.m5618() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9456.class != obj.getClass()) {
            return false;
        }
        return this.f32005.equals(((C9456) obj).f32005);
    }

    public final int hashCode() {
        return this.f32005.hashCode();
    }
}
