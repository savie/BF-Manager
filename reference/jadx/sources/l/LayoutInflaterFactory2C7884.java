package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.۟۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1H0 */
/* JADX INFO: loaded from: classes3.dex */
public final class LayoutInflaterFactory2C7884 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC3191 f26223;

    public LayoutInflaterFactory2C7884(AbstractC3191 abstractC3191) {
        this.f26223 = abstractC3191;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C9902 c9902M10501;
        boolean zEquals = C4155.class.getName().equals(str);
        AbstractC3191 abstractC3191 = this.f26223;
        if (zEquals) {
            return new C4155(context, attributeSet, abstractC3191);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4966.f17288);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null && C21309.m48547(context.getClassLoader(), attributeValue)) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                ComponentCallbacksC11612 componentCallbacksC11612M10441 = resourceId != -1 ? abstractC3191.m10441(resourceId) : null;
                if (componentCallbacksC11612M10441 == null && string != null) {
                    componentCallbacksC11612M10441 = abstractC3191.m10493(string);
                }
                if (componentCallbacksC11612M10441 == null && id != -1) {
                    componentCallbacksC11612M10441 = abstractC3191.m10441(id);
                }
                if (componentCallbacksC11612M10441 == null) {
                    C21309 c21309M10476 = abstractC3191.m10476();
                    context.getClassLoader();
                    componentCallbacksC11612M10441 = c21309M10476.mo27138(attributeValue);
                    componentCallbacksC11612M10441.mFromLayout = true;
                    componentCallbacksC11612M10441.mFragmentId = resourceId != 0 ? resourceId : id;
                    componentCallbacksC11612M10441.mContainerId = id;
                    componentCallbacksC11612M10441.mTag = string;
                    componentCallbacksC11612M10441.mInLayout = true;
                    componentCallbacksC11612M10441.mFragmentManager = abstractC3191;
                    componentCallbacksC11612M10441.mHost = abstractC3191.m10504();
                    componentCallbacksC11612M10441.onInflate(abstractC3191.m10504().m42754(), attributeSet, componentCallbacksC11612M10441.mSavedFragmentState);
                    c9902M10501 = abstractC3191.m10440(componentCallbacksC11612M10441);
                    if (AbstractC3191.m10427(2)) {
                        componentCallbacksC11612M10441.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (componentCallbacksC11612M10441.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    componentCallbacksC11612M10441.mInLayout = true;
                    componentCallbacksC11612M10441.mFragmentManager = abstractC3191;
                    componentCallbacksC11612M10441.mHost = abstractC3191.m10504();
                    componentCallbacksC11612M10441.onInflate(abstractC3191.m10504().m42754(), attributeSet, componentCallbacksC11612M10441.mSavedFragmentState);
                    c9902M10501 = abstractC3191.m10501(componentCallbacksC11612M10441);
                    if (AbstractC3191.m10427(2)) {
                        componentCallbacksC11612M10441.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C9047.m24148(componentCallbacksC11612M10441, viewGroup);
                componentCallbacksC11612M10441.mContainer = viewGroup;
                c9902M10501.m25725();
                c9902M10501.m25723();
                View view2 = componentCallbacksC11612M10441.mView;
                if (view2 == null) {
                    throw new IllegalStateException(C14442.m34865("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (componentCallbacksC11612M10441.mView.getTag() == null) {
                    componentCallbacksC11612M10441.mView.setTag(string);
                }
                componentCallbacksC11612M10441.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0426(this, c9902M10501));
                return componentCallbacksC11612M10441.mView;
            }
        }
        return null;
    }
}
