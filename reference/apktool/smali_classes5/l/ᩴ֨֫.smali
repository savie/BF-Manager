.class public final synthetic Ll/ᩴ֨֫;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Z

.field public final synthetic ܿ:Ll/᩷ۨᩴ;

.field public final synthetic ᩶:Ll/ۧۡ֫;


# direct methods
.method public synthetic constructor <init>(ZLl/ۧۡ֫;Ll/᩷ۨᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/ᩴ֨֫;->ܰ:Z

    iput-object p2, p0, Ll/ᩴ֨֫;->᩶:Ll/ۧۡ֫;

    iput-object p3, p0, Ll/ᩴ֨֫;->ܿ:Ll/᩷ۨᩴ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget-object v0, p0, Ll/ᩴ֨֫;->᩶:Ll/ۧۡ֫;

    iget-object v1, p0, Ll/ᩴ֨֫;->ܿ:Ll/᩷ۨᩴ;

    iget-boolean v2, p0, Ll/ᩴ֨֫;->ܰ:Z

    invoke-static {v2, v0, v1}, Ll/ۧۡ֫;->ۙ(ZLl/ۧۡ֫;Ll/᩷ۨᩴ;)V

    return-void
.end method
