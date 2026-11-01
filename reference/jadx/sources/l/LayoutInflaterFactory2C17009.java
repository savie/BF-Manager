package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܿ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1H0 */
/* JADX INFO: loaded from: classes4.dex */
public final class LayoutInflaterFactory2C17009 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC8894 f54360;

    public LayoutInflaterFactory2C17009(AbstractC8894 abstractC8894) {
        this.f54360 = abstractC8894;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C23711 c23711M23072;
        boolean zEquals = C15599.class.getName().equals(str);
        AbstractC8894 abstractC8894 = this.f54360;
        if (zEquals) {
            return new C15599(context, attributeSet, abstractC8894);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11987.f40160);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null && C0075.m1005(context.getClassLoader(), attributeValue)) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                ComponentCallbacksC22654 componentCallbacksC22654M23077 = resourceId != -1 ? abstractC8894.m23077(resourceId) : null;
                if (componentCallbacksC22654M23077 == null && string != null) {
                    componentCallbacksC22654M23077 = abstractC8894.m23119(string);
                }
                if (componentCallbacksC22654M23077 == null && id != -1) {
                    componentCallbacksC22654M23077 = abstractC8894.m23077(id);
                }
                if (componentCallbacksC22654M23077 == null) {
                    C0075 c0075M23108 = abstractC8894.m23108();
                    context.getClassLoader();
                    componentCallbacksC22654M23077 = c0075M23108.mo1008(attributeValue);
                    componentCallbacksC22654M23077.mFromLayout = true;
                    componentCallbacksC22654M23077.mFragmentId = resourceId != 0 ? resourceId : id;
                    componentCallbacksC22654M23077.mContainerId = id;
                    componentCallbacksC22654M23077.mTag = string;
                    componentCallbacksC22654M23077.mInLayout = true;
                    componentCallbacksC22654M23077.mFragmentManager = abstractC8894;
                    componentCallbacksC22654M23077.mHost = abstractC8894.m23106();
                    componentCallbacksC22654M23077.onInflate(abstractC8894.m23106().m38450(), attributeSet, componentCallbacksC22654M23077.mSavedFragmentState);
                    c23711M23072 = abstractC8894.m23079(componentCallbacksC22654M23077);
                    if (AbstractC8894.m23060(2)) {
                        componentCallbacksC22654M23077.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (componentCallbacksC22654M23077.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    componentCallbacksC22654M23077.mInLayout = true;
                    componentCallbacksC22654M23077.mFragmentManager = abstractC8894;
                    componentCallbacksC22654M23077.mHost = abstractC8894.m23106();
                    componentCallbacksC22654M23077.onInflate(abstractC8894.m23106().m38450(), attributeSet, componentCallbacksC22654M23077.mSavedFragmentState);
                    c23711M23072 = abstractC8894.m23072(componentCallbacksC22654M23077);
                    if (AbstractC8894.m23060(2)) {
                        componentCallbacksC22654M23077.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C1568.m5362(componentCallbacksC22654M23077, viewGroup);
                componentCallbacksC22654M23077.mContainer = viewGroup;
                c23711M23072.m52211();
                c23711M23072.m52213();
                View view2 = componentCallbacksC22654M23077.mView;
                if (view2 == null) {
                    throw new IllegalStateException(C16523.m38890("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (componentCallbacksC22654M23077.mView.getTag() == null) {
                    componentCallbacksC22654M23077.mView.setTag(string);
                }
                componentCallbacksC22654M23077.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC12071(this, c23711M23072));
                return componentCallbacksC22654M23077.mView;
            }
        }
        return null;
    }
}
