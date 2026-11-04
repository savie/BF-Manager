.class public final synthetic Ll/۫ܰᩴ;
.super Ljava/lang/Object;
.source "313O"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/֫ܰᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/֫ܰᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܰᩴ;->ܰ:Ll/֫ܰᩴ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 503
    iget-object p1, p0, Ll/۫ܰᩴ;->ܰ:Ll/֫ܰᩴ;

    iget-boolean v0, p1, Ll/֫ܰᩴ;->ۤ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/֫ܰᩴ;->ۙ()V

    :cond_0
    return-void
.end method
