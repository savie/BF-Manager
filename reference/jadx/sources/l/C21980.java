package l;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩷ۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6DO */
/* JADX INFO: loaded from: classes.dex */
public final class C21980 implements InterfaceC5252 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1843 f70922;

    public C21980(InterfaceC1843 interfaceC1843) {
        this.f70922 = interfaceC1843;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 != EnumC9330.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC11217.getLifecycle().mo23078(this);
        InterfaceC1843 interfaceC1843 = this.f70922;
        Bundle bundleM36619 = interfaceC1843.getSavedStateRegistry().m36619("androidx.savedstate.Restarter");
        if (bundleM36619 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM36619.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, C21980.class.getClassLoader()).asSubclass(InterfaceC22726.class);
                C15243.m36586(clsAsSubclass);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        C15243.m36586(objNewInstance);
                        ((InterfaceC22726) objNewInstance).mo42436(interfaceC1843);
                    } catch (Exception e) {
                        throw new RuntimeException(C25272.m56409("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(C14442.m34865("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
