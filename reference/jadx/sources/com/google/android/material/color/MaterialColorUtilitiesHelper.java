package com.google.android.material.color;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.Map;
import l.C16863;
import l.C4681;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialColorUtilitiesHelper {
    public static final Map colorResourceIdToColorValue;
    public static final MaterialDynamicColors dynamicColors;

    static {
        MaterialDynamicColors materialDynamicColors = new MaterialDynamicColors();
        dynamicColors = materialDynamicColors;
        HashMap map = new HashMap();
        map.put(Integer.valueOf(C16863.f54572), materialDynamicColors.primary());
        map.put(Integer.valueOf(C16863.f54484), materialDynamicColors.onPrimary());
        map.put(Integer.valueOf(C16863.f54751), materialDynamicColors.inversePrimary());
        map.put(Integer.valueOf(C16863.f54458), materialDynamicColors.primaryContainer());
        map.put(Integer.valueOf(C16863.f54665), materialDynamicColors.onPrimaryContainer());
        map.put(Integer.valueOf(C16863.f54934), materialDynamicColors.secondary());
        map.put(Integer.valueOf(C16863.f54621), materialDynamicColors.onSecondary());
        map.put(Integer.valueOf(C16863.f54888), materialDynamicColors.secondaryContainer());
        map.put(Integer.valueOf(C16863.f54823), materialDynamicColors.onSecondaryContainer());
        map.put(Integer.valueOf(C16863.f54980), materialDynamicColors.tertiary());
        map.put(Integer.valueOf(C16863.f55094), materialDynamicColors.onTertiary());
        map.put(Integer.valueOf(C16863.f54706), materialDynamicColors.tertiaryContainer());
        map.put(Integer.valueOf(C16863.f55002), materialDynamicColors.onTertiaryContainer());
        map.put(Integer.valueOf(C16863.f54845), materialDynamicColors.background());
        map.put(Integer.valueOf(C16863.f54709), materialDynamicColors.onBackground());
        map.put(Integer.valueOf(C16863.f55025), materialDynamicColors.surface());
        map.put(Integer.valueOf(C16863.f54549), materialDynamicColors.onSurface());
        map.put(Integer.valueOf(C16863.f54640), materialDynamicColors.surfaceVariant());
        map.put(Integer.valueOf(C16863.f54728), materialDynamicColors.onSurfaceVariant());
        map.put(Integer.valueOf(C16863.f54413), materialDynamicColors.inverseSurface());
        map.put(Integer.valueOf(C16863.f55071), materialDynamicColors.inverseOnSurface());
        map.put(Integer.valueOf(C16863.f54774), materialDynamicColors.surfaceBright());
        map.put(Integer.valueOf(C16863.f54957), materialDynamicColors.surfaceDim());
        map.put(Integer.valueOf(C16863.f54595), materialDynamicColors.surfaceContainer());
        map.put(Integer.valueOf(C16863.f54842), materialDynamicColors.surfaceContainerLow());
        map.put(Integer.valueOf(C16863.f55140), materialDynamicColors.surfaceContainerHigh());
        map.put(Integer.valueOf(C16863.f55048), materialDynamicColors.surfaceContainerLowest());
        map.put(Integer.valueOf(C16863.f54526), materialDynamicColors.surfaceContainerHighest());
        map.put(Integer.valueOf(C16863.f54865), materialDynamicColors.outline());
        map.put(Integer.valueOf(C16863.f54797), materialDynamicColors.outlineVariant());
        map.put(Integer.valueOf(C16863.f54643), materialDynamicColors.error());
        map.put(Integer.valueOf(C16863.f54439), materialDynamicColors.onError());
        map.put(Integer.valueOf(C16863.f54983), materialDynamicColors.errorContainer());
        map.put(Integer.valueOf(C16863.f54687), materialDynamicColors.onErrorContainer());
        map.put(Integer.valueOf(C16863.f55051), materialDynamicColors.controlActivated());
        map.put(Integer.valueOf(C16863.f54416), materialDynamicColors.controlNormal());
        map.put(Integer.valueOf(C16863.f54960), materialDynamicColors.controlHighlight());
        map.put(Integer.valueOf(C16863.f54684), materialDynamicColors.textPrimaryInverse());
        map.put(Integer.valueOf(C16863.f54662), materialDynamicColors.textSecondaryAndTertiaryInverse());
        map.put(Integer.valueOf(C16863.f54618), materialDynamicColors.textSecondaryAndTertiaryInverseDisabled());
        map.put(Integer.valueOf(C16863.f54481), materialDynamicColors.textPrimaryInverseDisableOnly());
        map.put(Integer.valueOf(C16863.f54436), materialDynamicColors.textHintInverse());
        colorResourceIdToColorValue = C4681.unmodifiableMap(map);
    }

    public static Map createColorResourcesIdsToColorValues(DynamicScheme dynamicScheme) {
        HashMap map = new HashMap();
        for (Map.Entry entry : colorResourceIdToColorValue.entrySet()) {
            map.put((Integer) entry.getKey(), Integer.valueOf(((DynamicColor) entry.getValue()).getArgb(dynamicScheme)));
        }
        return C4681.unmodifiableMap(map);
    }
}
