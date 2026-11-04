package l;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.util.JsonWriter;
import android.util.Size;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import com.alipay.sdk.m.u0.b;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: l.ܿܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36GP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18419 {
    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x029c  */
    /* JADX WARN: Code duplicated, block: B:29:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:35:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:38:0x030c  */
    /* JADX WARN: Code duplicated, block: B:41:0x033a  */
    /* JADX WARN: Code duplicated, block: B:43:0x034d  */
    /* JADX WARN: Code duplicated, block: B:44:0x034f  */
    /* JADX WARN: Code duplicated, block: B:47:0x035b A[LOOP:2: B:45:0x0355->B:47:0x035b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0389  */
    /* JADX WARN: Code duplicated, block: B:52:0x0390  */
    /* JADX WARN: Code duplicated, block: B:54:0x039f  */
    /* JADX WARN: Code duplicated, block: B:55:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x0416  */
    /* JADX WARN: Code duplicated, block: B:69:0x0452  */
    /* JADX WARN: Code duplicated, block: B:72:0x0463  */
    /* JADX WARN: Code duplicated, block: B:75:0x04a6 A[LOOP:1: B:73:0x04a0->B:75:0x04a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x04bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:81:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:86:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:91:0x0505  */
    /* JADX WARN: Code duplicated, block: B:93:0x050d  */
    /* JADX WARN: Code duplicated, block: B:94:0x050f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42938(XmlSerializer xmlSerializer, AccessibilityNodeInfo accessibilityNodeInfo) {
        char c;
        LinkedHashMap linkedHashMapM42936;
        LinkedHashMap linkedHashMapM42937;
        char c2;
        LinkedHashMap linkedHashMapM42938;
        char c3;
        int i;
        char c4;
        int i2;
        int i3;
        Object objM42933;
        LinkedHashMap linkedHashMapM42939;
        int i4;
        Object objM42934;
        LinkedHashMap linkedHashMapM429310;
        ArrayList arrayList;
        Iterator it;
        AccessibilityNodeInfo.ExtraRenderingInfo extraRenderingInfo;
        Size layoutSize;
        LinkedHashMap linkedHashMapM429311;
        LinkedHashMap linkedHashMapM429312;
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        ArrayList arrayList2;
        int i5;
        Rect rect = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect);
        m42940(xmlSerializer, "bounds-in-parent", rect.toShortString());
        m42940(xmlSerializer, "window-id", Integer.valueOf(accessibilityNodeInfo.getWindowId()));
        m42940(xmlSerializer, "child-count", Integer.valueOf(accessibilityNodeInfo.getChildCount()));
        m42940(xmlSerializer, "accessibility-focused", Boolean.valueOf(accessibilityNodeInfo.isAccessibilityFocused()));
        m42940(xmlSerializer, "editable", Boolean.valueOf(accessibilityNodeInfo.isEditable()));
        m42940(xmlSerializer, "content-invalid", Boolean.valueOf(accessibilityNodeInfo.isContentInvalid()));
        m42940(xmlSerializer, "dismissable", Boolean.valueOf(accessibilityNodeInfo.isDismissable()));
        m42940(xmlSerializer, "multi-line", Boolean.valueOf(accessibilityNodeInfo.isMultiLine()));
        m42940(xmlSerializer, "can-open-popup", Boolean.valueOf(accessibilityNodeInfo.canOpenPopup()));
        m42940(xmlSerializer, "input-type", Integer.valueOf(accessibilityNodeInfo.getInputType()));
        m42940(xmlSerializer, "live-region", Integer.valueOf(accessibilityNodeInfo.getLiveRegion()));
        m42940(xmlSerializer, "movement-granularities", Integer.valueOf(accessibilityNodeInfo.getMovementGranularities()));
        m42940(xmlSerializer, "text-selection-start", Integer.valueOf(accessibilityNodeInfo.getTextSelectionStart()));
        m42940(xmlSerializer, "text-selection-end", Integer.valueOf(accessibilityNodeInfo.getTextSelectionEnd()));
        m42940(xmlSerializer, "max-text-length", Integer.valueOf(accessibilityNodeInfo.getMaxTextLength()));
        m42940(xmlSerializer, d.O, accessibilityNodeInfo.getError());
        ArrayList arrayList3 = new ArrayList();
        for (AccessibilityNodeInfo.AccessibilityAction accessibilityAction : accessibilityNodeInfo.getActionList()) {
            arrayList3.add(m42936("id", Integer.valueOf(accessibilityAction.getId()), AnnotatedPrivateKey.LABEL, accessibilityAction.getLabel(), "description", accessibilityAction.toString()));
        }
        m42939(xmlSerializer, "actions", arrayList3);
        AccessibilityNodeInfo.RangeInfo rangeInfo = accessibilityNodeInfo.getRangeInfo();
        if (rangeInfo == null) {
            linkedHashMapM42936 = null;
            c = 7;
        } else {
            c = 7;
            linkedHashMapM42936 = m42936("type", Integer.valueOf(rangeInfo.getType()), "min", Float.valueOf(rangeInfo.getMin()), "max", Float.valueOf(rangeInfo.getMax()), "current", Float.valueOf(rangeInfo.getCurrent()));
        }
        m42939(xmlSerializer, "range-info", linkedHashMapM42936);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo == null) {
            c2 = 5;
            linkedHashMapM42937 = null;
        } else {
            Integer numValueOf = Integer.valueOf(collectionInfo.getRowCount());
            Integer numValueOf2 = Integer.valueOf(collectionInfo.getColumnCount());
            Boolean boolValueOf = Boolean.valueOf(collectionInfo.isHierarchical());
            Integer numValueOf3 = Integer.valueOf(collectionInfo.getSelectionMode());
            Object[] objArr = new Object[8];
            objArr[0] = "row-count";
            objArr[1] = numValueOf;
            objArr[2] = "column-count";
            objArr[3] = numValueOf2;
            objArr[4] = "hierarchical";
            objArr[5] = boolValueOf;
            objArr[6] = "selection-mode";
            objArr[c] = numValueOf3;
            linkedHashMapM42937 = m42936(objArr);
            if (Build.VERSION.SDK_INT >= 35) {
                linkedHashMapM42937.put("item-count", Integer.valueOf(collectionInfo.getItemCount()));
                linkedHashMapM42937.put("important-for-accessibility-item-count", Integer.valueOf(collectionInfo.getImportantForAccessibilityItemCount()));
            }
            c2 = 5;
        }
        m42939(xmlSerializer, "collection-info", linkedHashMapM42937);
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            Integer numValueOf4 = Integer.valueOf(collectionItemInfo.getRowIndex());
            Integer numValueOf5 = Integer.valueOf(collectionItemInfo.getColumnIndex());
            Integer numValueOf6 = Integer.valueOf(collectionItemInfo.getRowSpan());
            Integer numValueOf7 = Integer.valueOf(collectionItemInfo.getColumnSpan());
            Boolean boolValueOf2 = Boolean.valueOf(collectionItemInfo.isHeading());
            Boolean boolValueOf3 = Boolean.valueOf(collectionItemInfo.isSelected());
            Object[] objArr2 = new Object[12];
            objArr2[0] = "row-index";
            objArr2[1] = numValueOf4;
            objArr2[2] = "column-index";
            objArr2[3] = numValueOf5;
            objArr2[4] = "row-span";
            objArr2[c2] = numValueOf6;
            objArr2[6] = "column-span";
            objArr2[c] = numValueOf7;
            objArr2[8] = "heading";
            objArr2[9] = boolValueOf2;
            objArr2[10] = "selected";
            objArr2[11] = boolValueOf3;
            linkedHashMapM42938 = m42936(objArr2);
            if (Build.VERSION.SDK_INT >= 33) {
                c3 = 3;
                linkedHashMapM42938.put("row-title", collectionItemInfo.getRowTitle());
                linkedHashMapM42938.put("column-title", collectionItemInfo.getColumnTitle());
            }
            m42939(xmlSerializer, "collection-item-info", linkedHashMapM42938);
            m42939(xmlSerializer, "extras", accessibilityNodeInfo.getExtras());
            m42939(xmlSerializer, "label-for", m42934(accessibilityNodeInfo.getLabelFor()));
            m42939(xmlSerializer, "labeled-by", m42934(accessibilityNodeInfo.getLabeledBy()));
            i = Build.VERSION.SDK_INT;
            if (i >= 22) {
                m42939(xmlSerializer, "traversal-before", m42934(accessibilityNodeInfo.getTraversalBefore()));
                m42939(xmlSerializer, "traversal-after", m42934(accessibilityNodeInfo.getTraversalAfter()));
            }
            if (i >= 23) {
                m42940(xmlSerializer, "context-clickable", Boolean.valueOf(accessibilityNodeInfo.isContextClickable()));
            }
            if (i >= 24) {
                m42940(xmlSerializer, "drawing-order", Integer.valueOf(accessibilityNodeInfo.getDrawingOrder()));
                m42940(xmlSerializer, "important-for-accessibility", Boolean.valueOf(accessibilityNodeInfo.isImportantForAccessibility()));
            }
            if (i >= 26) {
                m42940(xmlSerializer, "hint-text", accessibilityNodeInfo.getHintText());
                m42940(xmlSerializer, "showing-hint-text", Boolean.valueOf(accessibilityNodeInfo.isShowingHintText()));
                m42939(xmlSerializer, "available-extra-data", accessibilityNodeInfo.getAvailableExtraData());
            }
            if (i >= 28) {
                m42940(xmlSerializer, "pane-title", accessibilityNodeInfo.getPaneTitle());
                m42940(xmlSerializer, "tooltip-text", accessibilityNodeInfo.getTooltipText());
                m42940(xmlSerializer, "heading", Boolean.valueOf(accessibilityNodeInfo.isHeading()));
                m42940(xmlSerializer, "screen-reader-focusable", Boolean.valueOf(accessibilityNodeInfo.isScreenReaderFocusable()));
            }
            if (i >= 29) {
                m42940(xmlSerializer, "text-entry-key", Boolean.valueOf(accessibilityNodeInfo.isTextEntryKey()));
                touchDelegateInfo = accessibilityNodeInfo.getTouchDelegateInfo();
                if (touchDelegateInfo == null) {
                    arrayList2 = null;
                } else {
                    arrayList2 = new ArrayList();
                    for (i5 = 0; i5 < touchDelegateInfo.getRegionCount(); i5++) {
                        Region regionAt = touchDelegateInfo.getRegionAt(i5);
                        LinkedHashMap linkedHashMapM42934 = m42934(touchDelegateInfo.getTargetForRegion(regionAt));
                        Object[] objArr3 = new Object[4];
                        objArr3[0] = "region";
                        objArr3[1] = regionAt;
                        objArr3[2] = "target";
                        objArr3[c3] = linkedHashMapM42934;
                        arrayList2.add(m42936(objArr3));
                    }
                }
                c4 = 2;
                m42939(xmlSerializer, "touch-delegate-info", arrayList2);
            } else {
                c4 = 2;
            }
            i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                m42940(xmlSerializer, "state-description", accessibilityNodeInfo.getStateDescription());
                extraRenderingInfo = accessibilityNodeInfo.getExtraRenderingInfo();
                if (extraRenderingInfo == null) {
                    linkedHashMapM429312 = null;
                } else {
                    layoutSize = extraRenderingInfo.getLayoutSize();
                    if (layoutSize == null) {
                        linkedHashMapM429311 = null;
                    } else {
                        Integer numValueOf8 = Integer.valueOf(layoutSize.getWidth());
                        Integer numValueOf9 = Integer.valueOf(layoutSize.getHeight());
                        Object[] objArr4 = new Object[4];
                        objArr4[0] = "width";
                        objArr4[1] = numValueOf8;
                        objArr4[c4] = "height";
                        objArr4[c3] = numValueOf9;
                        linkedHashMapM429311 = m42936(objArr4);
                    }
                    Float fValueOf = Float.valueOf(extraRenderingInfo.getTextSizeInPx());
                    Integer numValueOf10 = Integer.valueOf(extraRenderingInfo.getTextSizeUnit());
                    Object[] objArr5 = new Object[6];
                    objArr5[0] = "layout-size";
                    objArr5[1] = linkedHashMapM429311;
                    objArr5[c4] = "text-size-in-px";
                    objArr5[c3] = fValueOf;
                    objArr5[4] = "text-size-unit";
                    objArr5[c2] = numValueOf10;
                    linkedHashMapM429312 = m42936(objArr5);
                }
                m42939(xmlSerializer, "extra-rendering-info", linkedHashMapM429312);
            }
            if (i2 >= 33) {
                m42940(xmlSerializer, "unique-id", accessibilityNodeInfo.getUniqueId());
                m42940(xmlSerializer, "text-selectable", Boolean.valueOf(accessibilityNodeInfo.isTextSelectable()));
            }
            if (i2 >= 34) {
                accessibilityNodeInfo.getBoundsInWindow(rect);
                m42940(xmlSerializer, "bounds-in-window", rect.toShortString());
                m42940(xmlSerializer, "container-title", accessibilityNodeInfo.getContainerTitle());
                m42940(xmlSerializer, "accessibility-data-sensitive", Boolean.valueOf(accessibilityNodeInfo.isAccessibilityDataSensitive()));
                m42940(xmlSerializer, "request-initial-accessibility-focus", Boolean.valueOf(accessibilityNodeInfo.hasRequestInitialAccessibilityFocus()));
                m42940(xmlSerializer, "min-duration-between-content-changes", C7070.convert(accessibilityNodeInfo.getMinDurationBetweenContentChanges()));
            }
            if (i2 >= 35) {
                m42940(xmlSerializer, "granular-scrolling-supported", Boolean.valueOf(accessibilityNodeInfo.isGranularScrollingSupported()));
            }
            if (i2 >= 36) {
                m42940(xmlSerializer, "checked-state", Integer.valueOf(accessibilityNodeInfo.getChecked()));
                m42940(xmlSerializer, "expanded-state", Integer.valueOf(accessibilityNodeInfo.getExpandedState()));
                m42940(xmlSerializer, "field-required", Boolean.valueOf(accessibilityNodeInfo.isFieldRequired()));
                m42940(xmlSerializer, "supplemental-description", accessibilityNodeInfo.getSupplementalDescription());
                arrayList = new ArrayList();
                it = accessibilityNodeInfo.getLabeledByList().iterator();
                while (it.hasNext()) {
                    arrayList.add(m42934((AccessibilityNodeInfo) it.next()));
                }
                m42939(xmlSerializer, "labeled-by-list", arrayList);
            }
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 36) {
                if (i3 < 36) {
                    i4 = 100000 * i3;
                } else {
                    i4 = Build.VERSION.SDK_INT_FULL;
                }
                if (i4 >= 3600001) {
                    objM42934 = m42933(accessibilityNodeInfo, "getSelection");
                    if (objM42934 == null) {
                        linkedHashMapM429310 = null;
                    } else {
                        LinkedHashMap linkedHashMapM42935 = m42935(m42933(objM42934, "getStart"));
                        LinkedHashMap linkedHashMapM429313 = m42935(m42933(objM42934, "getEnd"));
                        Object[] objArr6 = new Object[4];
                        objArr6[0] = "start";
                        objArr6[1] = linkedHashMapM42935;
                        objArr6[c4] = "end";
                        objArr6[c3] = linkedHashMapM429313;
                        linkedHashMapM429310 = m42936(objArr6);
                    }
                    m42939(xmlSerializer, "selection", linkedHashMapM429310);
                }
            }
            if (i3 >= 37) {
                objM42933 = m42933(accessibilityNodeInfo, "getStructuredDataInfo");
                if (objM42933 == null) {
                    linkedHashMapM42939 = null;
                } else {
                    Object objM42935 = m42933(objM42933, "getTag");
                    Object objM42936 = m42933(objM42933, "getAttributes");
                    Object[] objArr7 = new Object[4];
                    objArr7[0] = "tag";
                    objArr7[1] = objM42935;
                    objArr7[c4] = "attributes";
                    objArr7[c3] = objM42936;
                    linkedHashMapM42939 = m42936(objArr7);
                }
                m42939(xmlSerializer, "structured-data-info", linkedHashMapM42939);
            }
        }
        linkedHashMapM42938 = null;
        c3 = 3;
        m42939(xmlSerializer, "collection-item-info", linkedHashMapM42938);
        m42939(xmlSerializer, "extras", accessibilityNodeInfo.getExtras());
        m42939(xmlSerializer, "label-for", m42934(accessibilityNodeInfo.getLabelFor()));
        m42939(xmlSerializer, "labeled-by", m42934(accessibilityNodeInfo.getLabeledBy()));
        i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            m42939(xmlSerializer, "traversal-before", m42934(accessibilityNodeInfo.getTraversalBefore()));
            m42939(xmlSerializer, "traversal-after", m42934(accessibilityNodeInfo.getTraversalAfter()));
        }
        if (i >= 23) {
            m42940(xmlSerializer, "context-clickable", Boolean.valueOf(accessibilityNodeInfo.isContextClickable()));
        }
        if (i >= 24) {
            m42940(xmlSerializer, "drawing-order", Integer.valueOf(accessibilityNodeInfo.getDrawingOrder()));
            m42940(xmlSerializer, "important-for-accessibility", Boolean.valueOf(accessibilityNodeInfo.isImportantForAccessibility()));
        }
        if (i >= 26) {
            m42940(xmlSerializer, "hint-text", accessibilityNodeInfo.getHintText());
            m42940(xmlSerializer, "showing-hint-text", Boolean.valueOf(accessibilityNodeInfo.isShowingHintText()));
            m42939(xmlSerializer, "available-extra-data", accessibilityNodeInfo.getAvailableExtraData());
        }
        if (i >= 28) {
            m42940(xmlSerializer, "pane-title", accessibilityNodeInfo.getPaneTitle());
            m42940(xmlSerializer, "tooltip-text", accessibilityNodeInfo.getTooltipText());
            m42940(xmlSerializer, "heading", Boolean.valueOf(accessibilityNodeInfo.isHeading()));
            m42940(xmlSerializer, "screen-reader-focusable", Boolean.valueOf(accessibilityNodeInfo.isScreenReaderFocusable()));
        }
        if (i >= 29) {
            m42940(xmlSerializer, "text-entry-key", Boolean.valueOf(accessibilityNodeInfo.isTextEntryKey()));
            touchDelegateInfo = accessibilityNodeInfo.getTouchDelegateInfo();
            if (touchDelegateInfo == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList();
                while (i5 < touchDelegateInfo.getRegionCount()) {
                    Region regionAt2 = touchDelegateInfo.getRegionAt(i5);
                    LinkedHashMap linkedHashMapM429314 = m42934(touchDelegateInfo.getTargetForRegion(regionAt2));
                    Object[] objArr8 = new Object[4];
                    objArr8[0] = "region";
                    objArr8[1] = regionAt2;
                    objArr8[2] = "target";
                    objArr8[c3] = linkedHashMapM429314;
                    arrayList2.add(m42936(objArr8));
                }
            }
            c4 = 2;
            m42939(xmlSerializer, "touch-delegate-info", arrayList2);
        } else {
            c4 = 2;
        }
        i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            m42940(xmlSerializer, "state-description", accessibilityNodeInfo.getStateDescription());
            extraRenderingInfo = accessibilityNodeInfo.getExtraRenderingInfo();
            if (extraRenderingInfo == null) {
                linkedHashMapM429312 = null;
            } else {
                layoutSize = extraRenderingInfo.getLayoutSize();
                if (layoutSize == null) {
                    linkedHashMapM429311 = null;
                } else {
                    Integer numValueOf11 = Integer.valueOf(layoutSize.getWidth());
                    Integer numValueOf12 = Integer.valueOf(layoutSize.getHeight());
                    Object[] objArr9 = new Object[4];
                    objArr9[0] = "width";
                    objArr9[1] = numValueOf11;
                    objArr9[c4] = "height";
                    objArr9[c3] = numValueOf12;
                    linkedHashMapM429311 = m42936(objArr9);
                }
                Float fValueOf2 = Float.valueOf(extraRenderingInfo.getTextSizeInPx());
                Integer numValueOf13 = Integer.valueOf(extraRenderingInfo.getTextSizeUnit());
                Object[] objArr10 = new Object[6];
                objArr10[0] = "layout-size";
                objArr10[1] = linkedHashMapM429311;
                objArr10[c4] = "text-size-in-px";
                objArr10[c3] = fValueOf2;
                objArr10[4] = "text-size-unit";
                objArr10[c2] = numValueOf13;
                linkedHashMapM429312 = m42936(objArr10);
            }
            m42939(xmlSerializer, "extra-rendering-info", linkedHashMapM429312);
        }
        if (i2 >= 33) {
            m42940(xmlSerializer, "unique-id", accessibilityNodeInfo.getUniqueId());
            m42940(xmlSerializer, "text-selectable", Boolean.valueOf(accessibilityNodeInfo.isTextSelectable()));
        }
        if (i2 >= 34) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
            m42940(xmlSerializer, "bounds-in-window", rect.toShortString());
            m42940(xmlSerializer, "container-title", accessibilityNodeInfo.getContainerTitle());
            m42940(xmlSerializer, "accessibility-data-sensitive", Boolean.valueOf(accessibilityNodeInfo.isAccessibilityDataSensitive()));
            m42940(xmlSerializer, "request-initial-accessibility-focus", Boolean.valueOf(accessibilityNodeInfo.hasRequestInitialAccessibilityFocus()));
            m42940(xmlSerializer, "min-duration-between-content-changes", C7070.convert(accessibilityNodeInfo.getMinDurationBetweenContentChanges()));
        }
        if (i2 >= 35) {
            m42940(xmlSerializer, "granular-scrolling-supported", Boolean.valueOf(accessibilityNodeInfo.isGranularScrollingSupported()));
        }
        if (i2 >= 36) {
            m42940(xmlSerializer, "checked-state", Integer.valueOf(accessibilityNodeInfo.getChecked()));
            m42940(xmlSerializer, "expanded-state", Integer.valueOf(accessibilityNodeInfo.getExpandedState()));
            m42940(xmlSerializer, "field-required", Boolean.valueOf(accessibilityNodeInfo.isFieldRequired()));
            m42940(xmlSerializer, "supplemental-description", accessibilityNodeInfo.getSupplementalDescription());
            arrayList = new ArrayList();
            it = accessibilityNodeInfo.getLabeledByList().iterator();
            while (it.hasNext()) {
                arrayList.add(m42934((AccessibilityNodeInfo) it.next()));
            }
            m42939(xmlSerializer, "labeled-by-list", arrayList);
        }
        i3 = Build.VERSION.SDK_INT;
        if (i3 >= 36) {
            if (i3 < 36) {
                i4 = 100000 * i3;
            } else {
                i4 = Build.VERSION.SDK_INT_FULL;
            }
            if (i4 >= 3600001) {
                objM42934 = m42933(accessibilityNodeInfo, "getSelection");
                if (objM42934 == null) {
                    linkedHashMapM429310 = null;
                } else {
                    LinkedHashMap linkedHashMapM429315 = m42935(m42933(objM42934, "getStart"));
                    LinkedHashMap linkedHashMapM429316 = m42935(m42933(objM42934, "getEnd"));
                    Object[] objArr11 = new Object[4];
                    objArr11[0] = "start";
                    objArr11[1] = linkedHashMapM429315;
                    objArr11[c4] = "end";
                    objArr11[c3] = linkedHashMapM429316;
                    linkedHashMapM429310 = m42936(objArr11);
                }
                m42939(xmlSerializer, "selection", linkedHashMapM429310);
            }
        }
        if (i3 >= 37) {
            objM42933 = m42933(accessibilityNodeInfo, "getStructuredDataInfo");
            if (objM42933 == null) {
                linkedHashMapM42939 = null;
            } else {
                Object objM42937 = m42933(objM42933, "getTag");
                Object objM42938 = m42933(objM42933, "getAttributes");
                Object[] objArr12 = new Object[4];
                objArr12[0] = "tag";
                objArr12[1] = objM42937;
                objArr12[c4] = "attributes";
                objArr12[c3] = objM42938;
                linkedHashMapM42939 = m42936(objArr12);
            }
            m42939(xmlSerializer, "structured-data-info", linkedHashMapM42939);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m42934(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo == null) {
            return null;
        }
        try {
            Rect rect = new Rect();
            accessibilityNodeInfo.getBoundsInScreen(rect);
            LinkedHashMap linkedHashMapM42936 = m42936("window-id", Integer.valueOf(accessibilityNodeInfo.getWindowId()), "package", accessibilityNodeInfo.getPackageName(), Name.LABEL, accessibilityNodeInfo.getClassName(), "resource-id", accessibilityNodeInfo.getViewIdResourceName(), TextBundle.TEXT_ENTRY, accessibilityNodeInfo.getText(), "bounds", rect.toShortString());
            if (Build.VERSION.SDK_INT >= 33) {
                linkedHashMapM42936.put("unique-id", accessibilityNodeInfo.getUniqueId());
            }
            return linkedHashMapM42936;
        } finally {
            accessibilityNodeInfo.recycle();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m42935(Object obj) {
        if (obj == null) {
            return null;
        }
        return m42936("node", m42934((AccessibilityNodeInfo) m42933(obj, "getNode")), "offset", m42933(obj, "getOffset"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m42933(Object obj, String str) throws IOException {
        try {
            return obj.getClass().getMethod(str, null).invoke(obj, null);
        } catch (ReflectiveOperationException e) {
            e = e;
            if (e instanceof InvocationTargetException) {
                e = e.getCause();
            }
            throw new IOException("Unable to read accessibility property: ".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m42936(Object... objArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            linkedHashMap.put((String) objArr[i], objArr[i + 1]);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m42940(XmlSerializer xmlSerializer, String str, Object obj) throws IOException {
        C17147.m40291(xmlSerializer, str, obj == null ? "" : obj.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42939(XmlSerializer xmlSerializer, String str, Object obj) throws IOException {
        if (obj == null) {
            m42940(xmlSerializer, str, null);
            return;
        }
        C2232 c2232 = new C2232();
        JsonWriter jsonWriter = new JsonWriter(c2232);
        jsonWriter.setIndent(EnumC7687.f25319);
        try {
            m42937(jsonWriter, obj, new IdentityHashMap(), 0);
            jsonWriter.flush();
            C17147.m40291(xmlSerializer, str, c2232.toString());
        } catch (BadParcelableException e) {
            m42940(xmlSerializer, str, "Unable to decode accessibility property: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42937(JsonWriter jsonWriter, Object obj, IdentityHashMap identityHashMap, int i) throws IOException {
        if (i > 128) {
            throw new IOException("Accessibility property nesting exceeds limit");
        }
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if ((obj instanceof CharSequence) || (obj instanceof Character)) {
            jsonWriter.value(obj.toString());
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                jsonWriter.value(obj.toString());
                return;
            } else {
                jsonWriter.value(number);
                return;
            }
        }
        if (identityHashMap.put(obj, Boolean.TRUE) != null) {
            throw new IOException("Cyclic accessibility property");
        }
        try {
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                jsonWriter.beginObject();
                for (String str : bundle.keySet()) {
                    jsonWriter.name(str);
                    m42937(jsonWriter, bundle.get(str), identityHashMap, i + 1);
                }
                jsonWriter.endObject();
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    m42937(jsonWriter, entry.getValue(), identityHashMap, i + 1);
                }
                jsonWriter.endObject();
            } else if (obj instanceof Iterable) {
                jsonWriter.beginArray();
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    m42937(jsonWriter, it.next(), identityHashMap, i + 1);
                }
                jsonWriter.endArray();
            } else {
                int i2 = 0;
                if (obj instanceof SparseArray) {
                    SparseArray sparseArray = (SparseArray) obj;
                    jsonWriter.beginObject();
                    while (i2 < sparseArray.size()) {
                        jsonWriter.name(Integer.toString(sparseArray.keyAt(i2)));
                        m42937(jsonWriter, sparseArray.valueAt(i2), identityHashMap, i + 1);
                        i2++;
                    }
                    jsonWriter.endObject();
                } else if (obj.getClass().isArray()) {
                    jsonWriter.beginArray();
                    while (i2 < Array.getLength(obj)) {
                        m42937(jsonWriter, Array.get(obj, i2), identityHashMap, i + 1);
                        i2++;
                    }
                    jsonWriter.endArray();
                } else if (obj instanceof Rect) {
                    jsonWriter.value(((Rect) obj).toShortString());
                } else if (obj instanceof RectF) {
                    RectF rectF = (RectF) obj;
                    jsonWriter.beginArray().value(rectF.left).value(rectF.top).value(rectF.right).value(rectF.bottom).endArray();
                } else if (obj instanceof Region) {
                    jsonWriter.beginArray();
                    RegionIterator regionIterator = new RegionIterator((Region) obj);
                    Rect rect = new Rect();
                    while (regionIterator.next(rect)) {
                        jsonWriter.value(rect.toShortString());
                    }
                    jsonWriter.endArray();
                } else {
                    jsonWriter.beginObject().name("type").value(obj.getClass().getName()).name(b.d).value(obj.toString()).endObject();
                }
            }
        } finally {
            identityHashMap.remove(obj);
        }
    }
}
