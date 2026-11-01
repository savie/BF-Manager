package com.google.android.material.color;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.Map;
import l.C0561;
import l.C22144;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialColorUtilitiesHelper {
    public static final Map colorResourceIdToColorValue;
    public static final MaterialDynamicColors dynamicColors;

    static {
        MaterialDynamicColors materialDynamicColors = new MaterialDynamicColors();
        dynamicColors = materialDynamicColors;
        HashMap map = new HashMap();
        map.put(Integer.valueOf(C22144.f72092), materialDynamicColors.primary());
        map.put(Integer.valueOf(C22144.f72137), materialDynamicColors.onPrimary());
        map.put(Integer.valueOf(C22144.f71888), materialDynamicColors.inversePrimary());
        map.put(Integer.valueOf(C22144.f71797), materialDynamicColors.primaryContainer());
        map.put(Integer.valueOf(C22144.f71729), materialDynamicColors.onPrimaryContainer());
        map.put(Integer.valueOf(C22144.f72366), materialDynamicColors.secondary());
        map.put(Integer.valueOf(C22144.f71979), materialDynamicColors.onSecondary());
        map.put(Integer.valueOf(C22144.f72251), materialDynamicColors.secondaryContainer());
        map.put(Integer.valueOf(C22144.f71774), materialDynamicColors.onSecondaryContainer());
        map.put(Integer.valueOf(C22144.f72229), materialDynamicColors.tertiary());
        map.put(Integer.valueOf(C22144.f71752), materialDynamicColors.onTertiary());
        map.put(Integer.valueOf(C22144.f71866), materialDynamicColors.tertiaryContainer());
        map.put(Integer.valueOf(C22144.f71843), materialDynamicColors.onTertiaryContainer());
        map.put(Integer.valueOf(C22144.f72182), materialDynamicColors.background());
        map.put(Integer.valueOf(C22144.f71865), materialDynamicColors.onBackground());
        map.put(Integer.valueOf(C22144.f72297), materialDynamicColors.surface());
        map.put(Integer.valueOf(C22144.f71820), materialDynamicColors.onSurface());
        map.put(Integer.valueOf(C22144.f72070), materialDynamicColors.surfaceVariant());
        map.put(Integer.valueOf(C22144.f72047), materialDynamicColors.onSurfaceVariant());
        map.put(Integer.valueOf(C22144.f72206), materialDynamicColors.inverseSurface());
        map.put(Integer.valueOf(C22144.f72115), materialDynamicColors.inverseOnSurface());
        map.put(Integer.valueOf(C22144.f71957), materialDynamicColors.surfaceBright());
        map.put(Integer.valueOf(C22144.f71684), materialDynamicColors.surfaceDim());
        map.put(Integer.valueOf(C22144.f72002), materialDynamicColors.surfaceContainer());
        map.put(Integer.valueOf(C22144.f72183), materialDynamicColors.surfaceContainerLow());
        map.put(Integer.valueOf(C22144.f71911), materialDynamicColors.surfaceContainerHigh());
        map.put(Integer.valueOf(C22144.f72320), materialDynamicColors.surfaceContainerLowest());
        map.put(Integer.valueOf(C22144.f72343), materialDynamicColors.surfaceContainerHighest());
        map.put(Integer.valueOf(C22144.f72389), materialDynamicColors.outline());
        map.put(Integer.valueOf(C22144.f71707), materialDynamicColors.outlineVariant());
        map.put(Integer.valueOf(C22144.f72069), materialDynamicColors.error());
        map.put(Integer.valueOf(C22144.f72024), materialDynamicColors.onError());
        map.put(Integer.valueOf(C22144.f72228), materialDynamicColors.errorContainer());
        map.put(Integer.valueOf(C22144.f72434), materialDynamicColors.onErrorContainer());
        map.put(Integer.valueOf(C22144.f72319), materialDynamicColors.controlActivated());
        map.put(Integer.valueOf(C22144.f72205), materialDynamicColors.controlNormal());
        map.put(Integer.valueOf(C22144.f71683), materialDynamicColors.controlHighlight());
        map.put(Integer.valueOf(C22144.f72435), materialDynamicColors.textPrimaryInverse());
        map.put(Integer.valueOf(C22144.f71730), materialDynamicColors.textSecondaryAndTertiaryInverse());
        map.put(Integer.valueOf(C22144.f71980), materialDynamicColors.textSecondaryAndTertiaryInverseDisabled());
        map.put(Integer.valueOf(C22144.f72138), materialDynamicColors.textPrimaryInverseDisableOnly());
        map.put(Integer.valueOf(C22144.f72025), materialDynamicColors.textHintInverse());
        colorResourceIdToColorValue = C0561.unmodifiableMap(map);
    }

    public static Map createColorResourcesIdsToColorValues(DynamicScheme dynamicScheme) {
        HashMap map = new HashMap();
        for (Map.Entry entry : colorResourceIdToColorValue.entrySet()) {
            map.put((Integer) entry.getKey(), Integer.valueOf(((DynamicColor) entry.getValue()).getArgb(dynamicScheme)));
        }
        return C0561.unmodifiableMap(map);
    }
}
