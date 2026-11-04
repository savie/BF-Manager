.class public final synthetic Ll/ܰۤ۫;
.super Ljava/lang/Object;
.source "J4L7"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:[Z

.field public final synthetic ܿ:Ljava/lang/Runnable;

.field public final synthetic ᩶:Ll/۠ۖۧ;


# direct methods
.method public synthetic constructor <init>([ZLl/۠ۖۧ;Ljava/lang/Runnable;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۤ۫;->ܰ:[Z

    iput-object p2, p0, Ll/ܰۤ۫;->᩶:Ll/۠ۖۧ;

    iput-object p3, p0, Ll/ܰۤ۫;->ܿ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 0
    iget-object p1, p0, Ll/ܰۤ۫;->᩶:Ll/۠ۖۧ;

    iget-object v0, p0, Ll/ܰۤ۫;->ܿ:Ljava/lang/Runnable;

    iget-object v1, p0, Ll/ܰۤ۫;->ܰ:[Z

    invoke-static {v1, p1, v0}, Ll/ۢۤ۫;->ۙ([ZLl/۠ۖۧ;Ljava/lang/Runnable;)V

    return-void
.end method
