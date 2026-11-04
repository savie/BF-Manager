package l;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩷ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAN2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23813 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC20326 f77135;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11132 m53138(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        C22321 c22321;
        C13612 c13612;
        C15243.m36590(sidecarDisplayFeature, "feature");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) C3172.m10364(sidecarDisplayFeature, this.f77135).mo17753("Type must be either TYPE_FOLD or TYPE_HINGE", C25305.f81747).mo17753("Feature bounds must not be 0", C17099.f55818).mo17753("TYPE_FOLD must have 0 area", C17845.f58533).mo17753("Feature be pinned to either left or top", C16353.f53093).mo17752();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            c22321 = C22321.f72251;
        } else {
            if (type != 2) {
                return null;
            }
            c22321 = C22321.f72250;
        }
        int iM29761 = C11878.m29761(sidecarDeviceState);
        if (iM29761 == 0 || iM29761 == 1) {
            return null;
        }
        if (iM29761 != 2) {
            c13612 = C13612.f43239;
            if (iM29761 != 3 && iM29761 == 4) {
                return null;
            }
        } else {
            c13612 = C13612.f43238;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        C15243.m36591(rect, "feature.rect");
        return new C11132(new C17342(rect), c22321, c13612);
    }

    public C23813(int i) {
        EnumC20326 enumC20326 = EnumC20326.QUIET;
        C15243.m36590(enumC20326, "verificationMode");
        this.f77135 = enumC20326;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14115 m53139(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new C14115(C22242.f71645);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C11878.m29760(sidecarDeviceState2, C11878.m29761(sidecarDeviceState));
        return new C14115(m53137(C11878.m29759(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m53135(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (C15243.m36589(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null) {
            return false;
        }
        return m53136(C11878.m29759(sidecarWindowLayoutInfo), C11878.m29759(sidecarWindowLayoutInfo2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m53136(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (m53134((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                    i = i2;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m53134(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (C15243.m36589(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return C15243.m36589(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m53137(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C11132 c11132M53138 = m53138((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (c11132M53138 != null) {
                arrayList.add(c11132M53138);
            }
        }
        return arrayList;
    }
}
