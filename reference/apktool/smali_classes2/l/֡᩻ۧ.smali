.class public final synthetic Ll/֡᩻ۧ;
.super Ljava/lang/Object;
.source "P1EM"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ܺۧۧ;

.field public final synthetic ᩶:Ll/ܽۧۧ;


# direct methods
.method public synthetic constructor <init>(Ll/ܺۧۧ;Ll/ܽۧۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩻ۧ;->ܰ:Ll/ܺۧۧ;

    iput-object p2, p0, Ll/֡᩻ۧ;->᩶:Ll/ܽۧۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 355
    iget-object v0, p0, Ll/֡᩻ۧ;->᩶:Ll/ܽۧۧ;

    iget v1, v0, Ll/ܽۧۧ;->ۙ:I

    iget v0, v0, Ll/ܽۧۧ;->᩷:I

    iget-object v2, p0, Ll/֡᩻ۧ;->ܰ:Ll/ܺۧۧ;

    invoke-interface {v2, v1, v0}, Ll/ܺۧۧ;->ۙ(II)V

    .line 356
    invoke-interface {v2}, Ll/ܺۧۧ;->᩷()V

    return-void
.end method
