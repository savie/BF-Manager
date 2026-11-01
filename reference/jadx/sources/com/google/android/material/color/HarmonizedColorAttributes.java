package com.google.android.material.color;

import l.C18616;
import l.C2387;

/* JADX INFO: loaded from: classes.dex */
public final class HarmonizedColorAttributes {
    public static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = {C2387.f8453, C2387.f8966, C2387.f9240, C2387.f9580};
    public final int[] attributes;
    public final int themeOverlay;

    public static HarmonizedColorAttributes create(int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    public static HarmonizedColorAttributes create(int[] iArr, int i) {
        return new HarmonizedColorAttributes(iArr, i);
    }

    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(HARMONIZED_MATERIAL_ATTRIBUTES, C18616.f59757);
    }

    public HarmonizedColorAttributes(int[] iArr, int i) {
        if (i != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.attributes = iArr;
        this.themeOverlay = i;
    }

    public int[] getAttributes() {
        return this.attributes;
    }

    public int getThemeOverlay() {
        return this.themeOverlay;
    }
}
