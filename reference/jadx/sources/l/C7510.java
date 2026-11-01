package l;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ܰۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAN2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7510 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC15709 f24989;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13155 m20011(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C1159 c1159;
        C5393 c5393;
        C13465.m32966(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) C20647.m46509(sidecarDisplayFeature, this.f24989).mo1388("Type must be either TYPE_FOLD or TYPE_HINGE", C8216.f28597).mo1388("Feature bounds must not be 0", C19505.f62738).mo1388("TYPE_FOLD must have 0 area", C8922.f30603).mo1388("Feature be pinned to either left or top", C10333.f35435).mo1387();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c1159 = C1159.f5184;
        } else {
            if (type != 2) {
                return null;
            }
            c1159 = C1159.f5183;
        }
        int iM43359 = C18799.m43359(sidecarDeviceState);
        if (iM43359 == 0 || iM43359 == 1) {
            return null;
        }
        if (iM43359 != 2) {
            c5393 = C5393.f18619;
            if (iM43359 != 3 && iM43359 == 4) {
                return null;
            }
        } else {
            c5393 = C5393.f18618;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        C13465.m32967(rect, "feature.rect");
        return new C13155(new C8653(rect), c1159, c5393);
    }

    public C7510(int i) {
        EnumC15709 enumC15709 = EnumC15709.QUIET;
        C13465.m32966(enumC15709, "verificationMode");
        this.f24989 = enumC15709;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5331 m20010(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C5331(C23238.f75405);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C18799.m43358(sidecarDeviceState2, C18799.m43359(sidecarDeviceState));
        return new C5331(m20009(C18799.m43357(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20007(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (C13465.m32965(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null) {
            return false;
        }
        return m20008(C18799.m43357(sidecarWindowLayoutInfo), C18799.m43357(sidecarWindowLayoutInfo2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20008(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (m20006((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20006(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (C13465.m32965(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return C13465.m32965(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m20009(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13155 c13155M20011 = m20011((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (c13155M20011 != null) {
                arrayList.add(c13155M20011);
            }
        }
        return arrayList;
    }
}
