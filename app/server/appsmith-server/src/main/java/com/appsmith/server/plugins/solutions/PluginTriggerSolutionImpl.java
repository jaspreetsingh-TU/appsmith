package com.appsmith.server.plugins.solutions;

import com.appsmith.server.helpers.PluginExecutorHelper;
import com.appsmith.server.repositories.PluginRepository;
import com.appsmith.server.services.ConfigService;
import com.appsmith.server.services.TenantService;
import com.appsmith.server.solutions.DatasourceTriggerSolution;
import org.springframework.stereotype.Component;

@Component
public class PluginTriggerSolutionImpl extends PluginTriggerSolutionCEImpl implements PluginTriggerSolution {
    public PluginTriggerSolutionImpl(
            DatasourceTriggerSolution datasourceTriggerSolution,
            PluginExecutorHelper pluginExecutorHelper,
            PluginRepository pluginRepository,
            ConfigService configService,
            TenantService tenantService) {
        super(datasourceTriggerSolution, pluginExecutorHelper, pluginRepository, configService, tenantService);
    }
}
