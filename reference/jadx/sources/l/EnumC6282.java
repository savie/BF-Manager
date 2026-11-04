package l;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: l.ۛۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 742G */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6282 implements InterfaceC24928 {
    CLASS_OUTPUT,
    SOURCE_OUTPUT,
    CLASS_PATH,
    SOURCE_PATH,
    ANNOTATION_PROCESSOR_PATH,
    ANNOTATION_PROCESSOR_MODULE_PATH,
    PLATFORM_CLASS_PATH,
    NATIVE_HEADER_OUTPUT,
    MODULE_SOURCE_PATH,
    UPGRADE_MODULE_PATH,
    SYSTEM_MODULES,
    MODULE_PATH,
    PATCH_MODULE_PATH;


    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMap f21335 = new ConcurrentMapC17249();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC24928 m17956(String str) {
        if (f21335.isEmpty()) {
            for (EnumC6282 enumC6282 : values()) {
                f21335.putIfAbsent(enumC6282.getName(), enumC6282);
            }
        }
        str.getClass();
        ConcurrentMap concurrentMap = f21335;
        concurrentMap.putIfAbsent(str, new C12247(str));
        return (InterfaceC24928) concurrentMap.get(str);
    }

    @Override // l.InterfaceC24928
    public String getName() {
        return name();
    }

    @Override // l.InterfaceC24928
    /* JADX INFO: renamed from: ᩸ */
    public boolean mo11525() {
        int iOrdinal = ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 7;
    }

    @Override // l.InterfaceC24928
    /* JADX INFO: renamed from: ۙ */
    public boolean mo11523() {
        int iOrdinal = ordinal();
        if (iOrdinal == 5) {
            return true;
        }
        switch (iOrdinal) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return true;
            default:
                return false;
        }
    }
}
