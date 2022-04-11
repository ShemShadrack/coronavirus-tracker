package covid.track.coronavirustracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import covid.track.coronavirustracker.models.LocationStats;
import covid.track.coronavirustracker.services.coronaVirusDataService;

@Controller
public class HomeController {
	
	@Autowired
	coronaVirusDataService coronavirus;
	
	@GetMapping("/")
	public String home(Model model){
		List<LocationStats> allStats = coronavirus.getAllStats();
		int totalReportedCases=allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
		int totalNewCases=allStats.stream().mapToInt(stat -> stat.getDiffFromPrefDay()).sum();
		model.addAttribute("LocationStats",allStats);
		model.addAttribute("totalReportedCases",totalReportedCases);
		model.addAttribute("totalNewCases",totalNewCases);
		return "home";
	}
}
