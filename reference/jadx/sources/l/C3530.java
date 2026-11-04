package l;

import com.google.android.material.motion.MotionUtils;
import java.util.List;

/* JADX INFO: renamed from: l.ۗܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 66DD */
/* JADX INFO: loaded from: classes3.dex */
public final class C3530 implements InterfaceC7179 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f12123;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f12124;

    public C3530(String str, List list) {
        this.f12124 = str;
        this.f12123 = list;
    }

    @Override // l.InterfaceC7179
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List mo11554() {
        return this.f12123;
    }

    @Override // l.InterfaceC7179
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String mo11553() {
        return this.f12124;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC7179)) {
            return false;
        }
        InterfaceC7179 interfaceC7179 = (InterfaceC7179) obj;
        return this.f12123.equals(interfaceC7179.mo11554()) && this.f12124.equals(interfaceC7179.mo11553());
    }

    public final int hashCode() {
        return this.f12124.hashCode() + (this.f12123.hashCode() * 31);
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + C6544.m18426(this.f12123) + MotionUtils.EASING_TYPE_FORMAT_END + this.f12124;
    }
}
