package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֡ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0325 {
    target,
    root,
    nth_child,
    nth_last_child,
    nth_of_type,
    nth_last_of_type,
    first_child,
    last_child,
    first_of_type,
    last_of_type,
    only_child,
    only_of_type,
    empty,
    not,
    lang,
    link,
    visited,
    hover,
    active,
    focus,
    enabled,
    disabled,
    checked,
    indeterminate,
    UNSUPPORTED;


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Map f1766 = new HashMap();

    static {
        for (EnumC0325 enumC0325 : values()) {
            if (enumC0325 != UNSUPPORTED) {
                f1766.put(enumC0325.name().replace('_', '-'), enumC0325);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC0325 m2018(String str) {
        EnumC0325 enumC0325 = (EnumC0325) f1766.get(str);
        return enumC0325 != null ? enumC0325 : UNSUPPORTED;
    }
}
