package l;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡۛܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q20L */
/* JADX INFO: loaded from: classes4.dex */
public final class C8696 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19985 f29914;

    public C8696(InterfaceC19985 interfaceC19985) {
        this.f29914 = interfaceC19985;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 != EnumC1651.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC1423.getLifecycle().mo9172(this);
        InterfaceC19985 interfaceC19985 = this.f29914;
        Bundle bundleM46522 = interfaceC19985.getSavedStateRegistry().m46522("androidx.savedstate.Restarter");
        if (bundleM46522 == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM46522.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, C8696.class.getClassLoader()).asSubclass(InterfaceC10107.class);
                C13465.m32967(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        C13465.m32967(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((InterfaceC10107) objNewInstance).mo25718(interfaceC19985);
                    } catch (Exception e) {
                        throw new RuntimeException(C0252.m1693("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(C16523.m38890("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
