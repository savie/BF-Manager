package l;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷۠ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20754 {
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


    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Map f67541 = new HashMap();

    static {
        for (EnumC20754 enumC20754 : values()) {
            if (enumC20754 != UNSUPPORTED) {
                f67541.put(enumC20754.name().replace('_', '-'), enumC20754);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20754 m46759(String str) {
        EnumC20754 enumC20754 = (EnumC20754) f67541.get(str);
        return enumC20754 != null ? enumC20754 : UNSUPPORTED;
    }
}
