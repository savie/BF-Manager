package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A6BV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22878 implements InterfaceC6470 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18959 f74337;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f74338;

    public AbstractC22878(C18959 c18959, AbstractC16481 abstractC16481) {
        this.f74337 = c18959;
        ArrayList arrayList = new ArrayList(c18959.m44039());
        if (c18959.m44027() == abstractC16481) {
            for (AbstractC16481 abstractC16482 : c18959.m44026()) {
                abstractC16482.getClass();
                if (abstractC16482 instanceof C6041) {
                    arrayList.add(((C6041) abstractC16482).m17530());
                }
            }
        } else {
            arrayList.add(c18959.m44027().m17530());
            for (AbstractC16481 abstractC16483 : c18959.m44026()) {
                if (abstractC16483 != abstractC16481) {
                    abstractC16483.getClass();
                    if (abstractC16483 instanceof C6041) {
                        arrayList.add(((C6041) abstractC16483).m17530());
                    }
                }
            }
        }
        this.f74338 = arrayList;
    }

    @Override // l.InterfaceC6470
    /* JADX INFO: renamed from: ۙ */
    public final ArrayList mo18294() {
        return this.f74338;
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f74337.getType() + ':' + C4123.m13222(this.f74338, ", ", new C3984(8)) + ')';
    }
}
